package co.ilsrbn.chat.api.core.repositories;

import co.ilsrbn.chat.api.core.models.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
    Set<MessageEntity> findByRoomEntityId(Long roomId);
}
