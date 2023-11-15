package co.ilsrbn.chat.api.core.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrivateChatDTO {
    private Long id;
    private String name;
    private Set<MessageDTO> messages;
}
