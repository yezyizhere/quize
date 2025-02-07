package com.example.quiz.Controller;

import com.example.quiz.Entity.User;
import com.example.quiz.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user, Model model) {
        userRepository.save(user);
        model.addAttribute("message", "사용자 저장 성공!");
        return "result";
    }
}
