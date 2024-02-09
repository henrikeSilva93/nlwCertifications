package nlw.certifications.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbl_alternatives")
public class Alternative {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "alternative_id")
    private UUID id;

    private String description;

   @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    private boolean isCorrect;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
