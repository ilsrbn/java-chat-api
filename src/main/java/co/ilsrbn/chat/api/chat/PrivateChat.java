package co.ilsrbn.chat.api.chat;

import co.ilsrbn.chat.api.core.dtos.AccountDTO;
import co.ilsrbn.chat.api.core.dtos.MessageDTO;
import co.ilsrbn.chat.api.core.models.MessageEntity;
import co.ilsrbn.chat.api.core.repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PrivateChat extends AbstractChat implements IChat {
    public PrivateChat(MessageRepository messageRepository) {
        super(messageRepository);
    }
}
