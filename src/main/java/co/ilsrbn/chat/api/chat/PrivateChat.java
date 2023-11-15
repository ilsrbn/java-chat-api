package co.ilsrbn.chat.api.chat;

import co.ilsrbn.chat.api.core.repositories.MessageRepository;
import co.ilsrbn.chat.api.core.repositories.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class PrivateChat extends AbstractChat implements IChat {
    public PrivateChat(MessageRepository messageRepository, RoomRepository roomRepository) {
        super(messageRepository, roomRepository);
    }
}
