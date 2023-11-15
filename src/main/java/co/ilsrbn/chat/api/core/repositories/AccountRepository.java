package co.ilsrbn.chat.api.core.repositories;

import co.ilsrbn.chat.api.core.models.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
