package _1.practica_dto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import _1.practica_dto.dto.MessageResponseDTO;
import _1.practica_dto.dto.StudentDTO;
import _1.practica_dto.dto.StudentRegisterDTO;
import _1.practica_dto.entity.Student;
import _1.practica_dto.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public List<StudentDTO> getStudents() {
        List<StudentDTO> listStudents = new ArrayList<>();
        List<Student> studentsFound = repository.findAll();

        for (Student student : studentsFound) {
            StudentDTO s = new StudentDTO();
            s.setName(student.getName());
            s.setTelephone(student.getTelephone());
            listStudents.add(s);
        }

        return listStudents;
    }

    public MessageResponseDTO deleteStudent(Integer id) {
        MessageResponseDTO response = new MessageResponseDTO();

        Optional<Student> studentFound = repository.findById(id);

        if (studentFound.isEmpty()) {
            response.setMessage("Usuario no encontrado");
            return response;
        }

        repository.deleteById(id);
        response.setMessage("Usuario eliminado exitosamente");
        return response;
    }

    public MessageResponseDTO addStudent(StudentRegisterDTO request) {

        MessageResponseDTO response = new MessageResponseDTO();

        Optional<Student> studentFound = repository.findByDocument(request.getDocument());

        if (studentFound.isPresent()) {
            response.setMessage("documento ya registrado");
            return response;
        }

        Student student = new Student();
        student.setDocument(request.getDocument());
        student.setName(request.getName());
        student.setTelephone(request.getTelephone());
        student.setPassword(request.getPassword());

        repository.save(student);

        response.setMessage("estudiante creado correctamente");

        return response;
    }

    public MessageResponseDTO updateStudent(Integer id, StudentRegisterDTO request) {

        MessageResponseDTO response = new MessageResponseDTO();

        Optional<Student> studentFound = repository.findById(id);

        if (studentFound.isEmpty()) {
            response.setMessage("estudiante no encontrado");
            return response;
        }

        Student student = studentFound.get();

        student.setDocument(request.getDocument());
        student.setName(request.getName());
        student.setTelephone(request.getTelephone());
        student.setPassword(request.getPassword());

        repository.save(student);

        response.setMessage("estudiante actualizado correctamente");

        return response;
    }
}
