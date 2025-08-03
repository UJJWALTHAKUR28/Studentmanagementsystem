package student.mangamentsytem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import student.mangamentsytem.entity.Marks;
import student.mangamentsytem.entity.User;
import student.mangamentsytem.service.MarksService;
import student.mangamentsytem.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@PreAuthorize("hasAuthority('STUDENT')")
public class StudentController {

    @Autowired
    private MarksService marksService;

    @Autowired
    private UserService userService;

    @GetMapping("/marks")
    public ResponseEntity<List<Marks>> getMarks(@RequestParam Long studentId) {
        User student = userService.findById(studentId);
        List<Marks> marks = marksService.getMarksByStudent(student);
        return ResponseEntity.ok(marks);
    }
}
