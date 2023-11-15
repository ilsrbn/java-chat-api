package co.ilsrbn.chat.api.core.repositories;

import co.ilsrbn.chat.api.core.models.ChatParticipantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatParticipantRepository extends JpaRepository<ChatParticipantEntity, Long> {
}
