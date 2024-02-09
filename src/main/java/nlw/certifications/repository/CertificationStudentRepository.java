package nlw.certifications.repository;

import nlw.certifications.entity.CertificationStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CertificationStudentRepository extends JpaRepository<CertificationStudent, Long> {

    @Query("SELECT c FROM tbl_certifications c INNER JOIN c.student s WHERE s.email = :email AND c.technology = :technology")
    List<CertificationStudent> verifyHasCertification(String email, String technology);
}
