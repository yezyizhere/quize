package com.example.quiz.Controller;

import com.example.quiz.Entity.Player;
import com.example.quiz.Entity.QuizQuestion;
import com.example.quiz.Entity.User;
import com.example.quiz.Repository.UserRepository;
import com.example.quiz.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@SessionAttributes("player")
public class QuizController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuizService quizService;

    @ModelAttribute("player")
    public Player createPlayer() {
        return new Player();
    }

    @PostMapping("/start")
    public String startQuiz(@ModelAttribute("user") User user,
                            @ModelAttribute("player") Player player,
                            RedirectAttributes redirectAttributes) {
        if (userRepository.findByName(user.getName()) != null) {
            redirectAttributes.addFlashAttribute("error", "이미 등록된 사용자입니다! 다른 이름을 입력하세요.");
            return "redirect:/register";
        }
        player.setName(user.getName());
        player.setScore(0);
        player.setCurrentQuestionIndex(0);
        return "redirect:/quiz";
    }

    @GetMapping("/quiz")
    public String showQuiz(Model model, @ModelAttribute("player") Player player) {
        List<QuizQuestion> questions = quizService.getQuestions();
        int index = player.getCurrentQuestionIndex();
        if (index >= questions.size()) {
            return "redirect:/result";
        }
        QuizQuestion currentQuestion = questions.get(index);
        model.addAttribute("question", currentQuestion);
        return "quiz";
    }

    @PostMapping("/quiz")
    public String checkAnswer(@RequestParam("selected") int selected,
                              @ModelAttribute("player") Player player,
                              Model model) {
        List<QuizQuestion> questions = quizService.getQuestions();
        int index = player.getCurrentQuestionIndex();
        if (index >= questions.size()) {
            return  "redirect:/result";
        }
        QuizQuestion currentQuestion = questions.get(index);

        if (selected == currentQuestion.getCorrectIndex()) {
            player.setScore(player.getScore() + 1);
            model.addAttribute("feedback", "정답입니다!");
        } else {
            model.addAttribute("feedback", "오답입니다!");
        }
        player.setCurrentQuestionIndex(index+1);
        return "redirect:/quiz";
    }

    @GetMapping("/result")
    public String result(@ModelAttribute("player") Player player, Model model) {
        User newUser = new User();
        newUser.setName(player.getName());
        newUser.setScore(player.getScore());
        userRepository.save(newUser);
        model.addAttribute("score", player.getScore());
        return "result";
    }
}
