package nlw.certifications.dto;

import nlw.certifications.entity.Question;

import java.util.List;

public class StudentCertificationAnswersDTO {
    private String email;
    private String technology;
    private List<QuestionAnswerDTO> questionAnswer;
}
