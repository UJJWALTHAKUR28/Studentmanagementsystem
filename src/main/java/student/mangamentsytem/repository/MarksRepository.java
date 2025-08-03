package student.mangamentsytem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.mangamentsytem.entity.Marks;
import student.mangamentsytem.entity.Subject;
import student.mangamentsytem.entity.User;

public interface MarksRepository extends JpaRepository<Marks, Long> {
    List<Marks> findByStudent(User student);
    List<Marks> findBySubject(Subject subject);
    Marks findByStudentAndSubject(User student, Subject subject);
}
