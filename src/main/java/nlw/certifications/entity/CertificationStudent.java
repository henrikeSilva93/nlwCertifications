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
@Entity(name = "tbl_certifications")
public class CertificationStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "certification_id")
    private UUID id;

    @Column(length = 10)
    private String technology;

    @Column(length = 3)
    private int grade;

    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;

//    List<AnswerCertification> answersCertification;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
