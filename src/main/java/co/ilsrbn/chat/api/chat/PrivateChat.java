package co.ilsrbn.chat.api.chat;

import co.ilsrbn.chat.api.core.dtos.MessageDTO;
import co.ilsrbn.chat.api.core.models.MessageEntity;
import co.ilsrbn.chat.api.core.repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PrivateChat implements IChat {
    private MessageRepository messageRepository;

    public PrivateChat(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Set<MessageDTO> getMessages(Long chatId) {
        Set<MessageEntity> messageEntities = messageRepository.findByRoomEntityId(chatId);
        return null;
    }

    @Override
    public Set<MessageDTO> getMessages(Long chatId, Integer page, Integer messagesPerPage) {
        return null;
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
