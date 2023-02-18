package com.learningmanagementsystem.services;

import com.learningmanagementsystem.model.Users;
import com.learningmanagementsystem.repository.StudentRepository;
import com.learningmanagementsystem.repository.TeacherRepository;
import com.learningmanagementsystem.repository.UserRepository;

public interface UserService {

    UserRepository userRepository(Users user);


}
