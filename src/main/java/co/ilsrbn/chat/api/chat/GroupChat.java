package co.ilsrbn.chat.api.chat;

import co.ilsrbn.chat.api.core.dtos.MessageDTO;
import co.ilsrbn.chat.api.core.repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class GroupChat extends AbstractChat implements IChat {
    public GroupChat(MessageRepository messageRepository) {
        super(messageRepository);
    }
}
