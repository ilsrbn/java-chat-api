package co.ilsrbn.chat.api.account;
import co.ilsrbn.chat.api.chatParicipant.ChatParticipantEntity;
import co.ilsrbn.chat.api.message.MessageEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "accounts")
public class AccountEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "account")
    private Set<MessageEntity> messageEntities;

    @OneToMany(mappedBy = "account")
    private Set<ChatParticipantEntity> chatParticipantEntities;

    @CreationTimestamp
    private Instant createdAt;
}