package nlw.certifications.controller;

import nlw.certifications.dto.QuestionDTO;
import nlw.certifications.entity.Question;
import nlw.certifications.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/question")
public class QuestionController {
    private QuestionService questionService;
    public QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }
    @GetMapping
    public ResponseEntity<List<QuestionDTO>> getAll(){
        return  ResponseEntity.status(HttpStatus.OK).body(this.questionService.getAllQuestions());

    }
//    ResponseEntity.status(HttpStatus.OK).body(this.questionService.findByTechnology(technology.toUpperCase()));
    @GetMapping("/technology/{technology}")
    public ResponseEntity<List<Question>> getByTechnology(@PathVariable String technology){
        return ResponseEntity.status(HttpStatus.OK).body(this.questionService.findByTechnology(technology.toUpperCase()));
    }

}
