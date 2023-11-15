package co.ilsrbn.chat.api.chat;

import co.ilsrbn.chat.api.core.dtos.AccountDTO;
import co.ilsrbn.chat.api.core.dtos.MessageDTO;
import co.ilsrbn.chat.api.core.dtos.PrivateChatDTO;
import co.ilsrbn.chat.api.core.models.MessageEntity;
import co.ilsrbn.chat.api.core.models.RoomEntity;
import co.ilsrbn.chat.api.core.repositories.MessageRepository;
import co.ilsrbn.chat.api.core.repositories.RoomRepository;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class AbstractChat implements IChat {
    protected final MessageRepository messageRepository;
    protected final RoomRepository roomRepository;

    public AbstractChat(MessageRepository messageRepository, RoomRepository roomRepository) {
        this.messageRepository = messageRepository;
        this.roomRepository = roomRepository;
    }
    @Override
    public Optional<PrivateChatDTO> getChat(Long chatId) {
        Optional<RoomEntity> optionalRoomEntity = roomRepository.findById(chatId);

        if(optionalRoomEntity.isEmpty()) return Optional.empty();

        RoomEntity room = optionalRoomEntity.get();

        return Optional.of(roomToChatDTO(room));
    }
    @Override
    public Set<MessageDTO> getMessages(Long chatId) {
        Set<MessageEntity> messageEntities = messageRepository.findByRoomEntityId(chatId);
        return messageEntitiesToDTOS(messageEntities);
    }
    @Override
    public void readMessage(Long messageId) {
    }
    @Override
    public void sendMessage(Long chatId, Long senderId, String messageText) {

    }
    @Override
    public void getInfo(Long chatId) {

    }
    private PrivateChatDTO roomToChatDTO(RoomEntity roomEntity) {
        return PrivateChatDTO
                .builder()
                .id(roomEntity.getId())
                .name(roomEntity.getName())
                .messages(messageEntitiesToDTOS(roomEntity.getMessageEntities()))
                .build();
    }
    private Set<MessageDTO> messageEntitiesToDTOS(Set<MessageEntity> messageEntities) {
        return messageEntities
                .stream()
                .map(this::messageEntityToDTO)
                .collect(Collectors.toSet());
    }
    private MessageDTO messageEntityToDTO(MessageEntity messageEntity) {
        return MessageDTO
                .builder()
                .id(messageEntity.getId())
                .content(messageEntity.getContent())
                .createdAt(messageEntity.getCreatedAt())
                .sender(
                        AccountDTO
                                .builder()
                                .id(messageEntity.getAccountEntity().getId())
                                .username(messageEntity.getAccountEntity().getUsername())
                                .build()
                       )
                .build();
    }
}
