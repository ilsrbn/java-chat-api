package co.ilsrbn.chat.api.chat;

import co.ilsrbn.chat.api.core.dtos.AccountDTO;
import co.ilsrbn.chat.api.core.dtos.MessageDTO;
import co.ilsrbn.chat.api.core.models.MessageEntity;
import co.ilsrbn.chat.api.core.repositories.MessageRepository;

import java.util.Set;
import java.util.stream.Collectors;

public abstract class AbstractChat implements IChat {
    private final MessageRepository messageRepository;

    public AbstractChat(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Set<MessageDTO> getMessages(Long chatId) {
        Set<MessageEntity> messageEntities = messageRepository.findByRoomEntityId(chatId);
        return messageEntities
                .stream()
                .map(messageEntity -> MessageDTO
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
                        .build()
                    )
                .collect(Collectors.toSet());
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
}
