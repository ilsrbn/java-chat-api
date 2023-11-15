package co.ilsrbn.chat.api.core.repositories;

import co.ilsrbn.chat.api.core.models.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
}
