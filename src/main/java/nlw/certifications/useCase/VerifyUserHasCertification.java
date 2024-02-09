package nlw.certifications.useCase;

import nlw.certifications.dto.VerifyHasCertificationDTO;
import nlw.certifications.repository.CertificationStudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class VerifyUserHasCertification {

    CertificationStudentRepository certificationStudentRepository;

    public VerifyUserHasCertification(CertificationStudentRepository certificationStudentRepository){
        this.certificationStudentRepository = certificationStudentRepository;
    }
    public boolean verify(VerifyHasCertificationDTO verifyHasCertificationDTO){
       var verify = this.certificationStudentRepository.verifyHasCertification(verifyHasCertificationDTO.getEmail(), verifyHasCertificationDTO.getTechnology().toUpperCase());
        if(!verify.isEmpty()){
            return true;
        }
        return false;
    }
}
