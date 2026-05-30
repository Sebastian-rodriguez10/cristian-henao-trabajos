package _1.practica_dto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import _1.practica_dto.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    Optional<Student> findByDocument(String document);

}
