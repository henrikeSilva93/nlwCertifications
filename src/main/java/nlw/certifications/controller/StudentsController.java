package nlw.certifications.controller;

import nlw.certifications.dto.StudentDTO;
import nlw.certifications.dto.VerifyHasCertificationDTO;
import nlw.certifications.entity.Student;
import nlw.certifications.service.StudentService;
import nlw.certifications.useCase.VerifyUserHasCertification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")

public class StudentsController {

    private VerifyUserHasCertification verifyUserHasCertification;
    @Autowired
    private StudentService studentService;

    public StudentsController(VerifyUserHasCertification verifyUserHasCertification) {
        this.verifyUserHasCertification = verifyUserHasCertification;
    }

    @GetMapping("/students")
    public List<StudentDTO> getAllStudents(){
        return this.studentService.listStudents()
                .stream().map(student -> new StudentDTO(student.getId(),student.getEmail()))
                .collect(Collectors.toList());
    }

    @PostMapping("/students/verify")
    public String verifyIfHasCertifications(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO ){
        return this.verifyUserHasCertification.verify(verifyHasCertificationDTO) ? "O Estudante já possui certificação" : "O estudante não possui certificação";
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        return this.studentService.createStudent(student);
    }

}
