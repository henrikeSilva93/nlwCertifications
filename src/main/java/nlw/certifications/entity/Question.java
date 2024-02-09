package nlw.certifications.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbl_questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "question_id")
    private UUID id;

    @Column(length = 10)
    private String technology;

    private String description;

    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnore
    private List<Alternative> alternatives;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
