package co.ilsrbn.chat.api.core.dtos;

import co.ilsrbn.chat.api.core.dtos.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageDTO {
    private Long id;
    private String content;
    private Instant createdAt;
    private AccountDTO sender;
}
