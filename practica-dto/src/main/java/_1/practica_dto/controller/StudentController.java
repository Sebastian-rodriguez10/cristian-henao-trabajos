package _1.practica_dto.controller;

import org.springframework.web.bind.annotation.RestController;

import _1.practica_dto.dto.MessageResponseDTO;
import _1.practica_dto.dto.StudentDTO;
import _1.practica_dto.dto.StudentRegisterDTO;
import _1.practica_dto.service.StudentService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("students")
@RequiredArgsConstructor

public class StudentController {

    private final StudentService service;
     @GetMapping("/get-students")
     public List<StudentDTO> getStudents() {
        return service.getStudents();
     }
     @PostMapping("/add-student")
     public MessageResponseDTO addStudent(@RequestBody StudentRegisterDTO request) {
        return service.addStudent(request);
     }
     
     @PutMapping("/put-student/{id}")
     public MessageResponseDTO updateStudent(@PathVariable Integer id, @RequestBody StudentRegisterDTO request) {
        return service.updateStudent(id, request);
     }

     @DeleteMapping("/delete-student/{id}") 
     public  MessageResponseDTO deleteStudent(@PathVariable Integer id) {
        return service.deleteStudent(id);
     }

        
}
