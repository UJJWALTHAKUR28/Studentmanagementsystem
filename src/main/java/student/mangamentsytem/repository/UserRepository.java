package student.mangamentsytem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.mangamentsytem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
