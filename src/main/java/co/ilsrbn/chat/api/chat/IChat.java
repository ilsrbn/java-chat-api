package co.ilsrbn.chat.api.chat;

import co.ilsrbn.chat.api.core.dtos.MessageDTO;

import java.util.Set;

public interface IChat {
    Set<MessageDTO> getMessages(Long chatId);
//    Set<MessageDTO> getMessages(Long chatId, Integer page, Integer messagesPerPage);
    void readMessage(Long messageId);
    void sendMessage(Long chatId, Long senderId, String messageText);
    void getInfo(Long chatId);
}
