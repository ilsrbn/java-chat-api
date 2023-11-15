package co.ilsrbn.chat.api.core.dtos;

import lombok.*;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupChatDTO extends PrivateChatDTO {
    private Set<AccountDTO> members;
}
