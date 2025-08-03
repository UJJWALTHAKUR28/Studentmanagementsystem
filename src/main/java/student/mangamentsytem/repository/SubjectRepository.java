package student.mangamentsytem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.mangamentsytem.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject findByCode(String code);
}
