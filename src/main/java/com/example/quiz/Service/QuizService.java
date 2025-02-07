package com.example.quiz.Service;

import com.example.quiz.Entity.QuizQuestion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuizService {

    public List<QuizQuestion> getQuestions() {
        List<QuizQuestion> list = new ArrayList<>();

        // 문제 1
        list.add(new QuizQuestion(
                "문제 1번의 예시",
                Arrays.asList("1번 답안","2번 답안","3번 답안","4번 답안"),
        0,
                "https://search.pstatic.net/common?type=f&size=206x206&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20210418_136%2F1618674583729CsTje_JPEG%2F54810200578891611_-1854514124.jpg"
                ));
        // 문제 2
        list.add(new QuizQuestion(
                "문제 2번의 예시",
                Arrays.asList("1번 답안","2번 답안","3번 답안","4번 답안"),
                1,
                "https://search.pstatic.net/common?type=f&size=206x206&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20210420_119%2F1618917792831Sb33v_JPEG%2F55053401463382237_1240304716.jpeg"
                ));
        // 문제 3
        list.add(new QuizQuestion(
                "문제 3번의 예시",
                Arrays.asList("1번 답안","2번 답안","3번 답안","4번 답안"),
                2,
                "https://search.pstatic.net/common?type=f&size=206x206&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20200724_215%2F1595581349044jAHJA_JPEG%2F31716943718608376_1431937637.jpeg"
                ));
        // 문제 4
        list.add(new QuizQuestion(
                "문제 4번의 예시",
                Arrays.asList("1번 답안","2번 답안","3번 답안","4번 답안"),
                3,
                "https://search.pstatic.net/common?type=f&size=206x206&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20210522_279%2F1621673915289mxlar_JPEG%2F57809532425488875_-1425368071.jpg"
                ));
        // 문제 5
        list.add(new QuizQuestion(
                "문제 5번의 예시",
                Arrays.asList("1번 답안","2번 답안","3번 답안","4번 답안"),
                3,
                "https://search.pstatic.net/common?type=f&size=206x206&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20200806_20%2F1596683152967IlYFi_JPEG%2F32818768910658433_478020071.jpeg"
                ));

        return list;
    }
}
