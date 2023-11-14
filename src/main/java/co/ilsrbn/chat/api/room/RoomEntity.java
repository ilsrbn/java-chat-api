package co.ilsrbn.chat.api.room;

import co.ilsrbn.chat.api.chat.ChatEntity;
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
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Long lastMessageId;

    @OneToMany(mappedBy = "room")
    Set<MessageEntity> messageEntities;

    @OneToMany(mappedBy = "room")
    Set<ChatEntity> chatEntities;

    @CreationTimestamp
    private Instant createdAt;
}