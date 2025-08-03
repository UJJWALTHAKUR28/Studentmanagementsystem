package student.mangamentsytem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.mangamentsytem.entity.Marks;
import student.mangamentsytem.entity.User;
import student.mangamentsytem.repository.MarksRepository;

@Service
public class MarksService {

    @Autowired
    private MarksRepository marksRepository;

    public List<Marks> getMarksByStudent(User student) {
        return marksRepository.findByStudent(student);
    }
}
