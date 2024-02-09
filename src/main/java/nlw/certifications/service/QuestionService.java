package nlw.certifications.service;

import nlw.certifications.dto.AlternativeDTO;
import nlw.certifications.dto.QuestionDTO;
import nlw.certifications.entity.Alternative;
import nlw.certifications.entity.Question;
import nlw.certifications.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class QuestionService {
   private QuestionRepository questionRepository;
    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository  = questionRepository;
    }
    public List<QuestionDTO> getAllQuestions(){
        return this.questionRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public List<Question> findByTechnology(String technology) {
        return this.questionRepository.findByTechnology(technology);
    }

    private QuestionDTO convertToDTO(Question question) {
     return  QuestionDTO.builder().id(question.getId())
              .description(question.getDescription())
              .technology(question.getTechnology())
              .alternatives(question.getAlternatives().stream()
                      .map(this::mapAlternativeDTO)
                      .collect(Collectors.toList()))
             .build();
    }

    private AlternativeDTO mapAlternativeDTO(Alternative alternativeDTO) {
        return AlternativeDTO.builder()
                .id(alternativeDTO.getId())
                .description(alternativeDTO.getDescription())
                .isCorrect(alternativeDTO.isCorrect())
                .createdAt(alternativeDTO.getCreatedAt())
                .build();
    }
}
