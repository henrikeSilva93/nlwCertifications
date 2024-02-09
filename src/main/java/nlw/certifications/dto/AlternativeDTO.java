package nlw.certifications.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlternativeDTO {
    private UUID id;
    private String description;
    private boolean isCorrect;
    private LocalDateTime createdAt;
}
