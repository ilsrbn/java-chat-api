package co.ilsrbn.chat.api.chat;

import co.ilsrbn.chat.api.core.dtos.MessageDTO;

import java.util.Set;

public class GroupChat implements IChat {
    @Override
    public Set<MessageDTO> getMessages(Long chatId) {
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
