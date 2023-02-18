package com.learningmanagementsystem.implementation;

import com.learningmanagementsystem.model.Student;
import com.learningmanagementsystem.model.Teacher;
import com.learningmanagementsystem.model.Users;
import com.learningmanagementsystem.repository.StudentRepository;
import com.learningmanagementsystem.repository.TeacherRepository;
import com.learningmanagementsystem.repository.UserRepository;
import com.learningmanagementsystem.services.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class UserImpl implements UserService {

    private final UserRepository usersRepository;

    private final StudentRepository studentRepository;

    private final TeacherRepository teacherRepository;

    public List<Users> users= new ArrayList<>();

    @Override
    public UserRepository userRepository(Users user) {
        Users users = new Users();
        log.info("User : " + user.getEmail());
        log.info("User : " + user.getPassword());

        if (user.getEmail().equals("admin") && user.getPassword().equals("admin")) {
            users.setRole(1);
            users.setId(1L);
            users.setEmail("Admin");
            return userRepository(users);
        }

        usersRepository.findAll().forEach(userdb -> {

            log.info("HERE 0 ");
            if (user.getEmail().equals(userdb.getEmail()) && user.getPassword().equals(userdb.getPassword())) {
                users.setEmail(userdb.getEmail());
                users.setPassword(userdb.getPassword());
                users.setRole(userdb.getRole());
                users.setId(userdb.getId());
                log.info("HERE 1 ");
                Student student = studentRepository.findByEmail(userdb.getEmail());
                Teacher teacher = teacherRepository.findByEmail(userdb.getEmail());

                if (student == null && teacher != null) {
                    users.setId(teacher.getTeacherId());
                } else {
                    users.setId(student.getStudentId());
                }
            }
        });
        return userRepository(users);
    }
}
