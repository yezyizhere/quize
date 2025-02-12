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
                "호텔방에 못 들어간 이유는?",
                Arrays.asList("키를 잃어버려서","옆방이어서","다른층이어서","내부 청소중이어서", "모르겠음"),
                2,
                "https://github.com/yezyizhere/quize/blob/main/%ED%80%B4%EC%A6%88%20%EC%82%AC%EC%A7%84/1%EB%B2%88.png?raw=true"
                ));
        // 문제 2
        list.add(new QuizQuestion(
                "이 다음 놀란 이유는?",
                Arrays.asList("쥐를 봐서","풍선이 터져서","핸드폰을 떨어트려서","비둘기 때문에", "모르겠음"),
                3,
                "https://github.com/yezyizhere/quize/blob/main/%ED%80%B4%EC%A6%88%20%EC%82%AC%EC%A7%84/2%EB%B2%88.png?raw=true"
                ));
        // 문제 3
        list.add(new QuizQuestion(
                "사진 업로드 날짜는?",
                Arrays.asList("2024-09-22","2023-08-11","2024-07-23","2024-10-10", "모르겠음"),
                0,
                "https://github.com/yezyizhere/quize/blob/main/%ED%80%B4%EC%A6%88%20%EC%82%AC%EC%A7%84/240922-1.jpg?raw=true"
                ));
        // 문제 4
        list.add(new QuizQuestion(
                "뭘 먹었을까요?",
                Arrays.asList("랍스타","광어","참치","방어", "모르겠음"),
                3,
                "https://github.com/yezyizhere/quize/blob/main/%ED%80%B4%EC%A6%88%20%EC%82%AC%EC%A7%84/4%EB%B2%88.png?raw=true"
                ));
        // 문제 5
        list.add(new QuizQuestion(
                "붕어빵 가장 먼저 먹는 부위는?",
                Arrays.asList("꼬리","지느러미","몸통","머리", "모르겠음"),
                3,
                "https://search.pstatic.net/common?type=f&size=206x206&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20200806_20%2F1596683152967IlYFi_JPEG%2F32818768910658433_478020071.jpeg"
                ));

        return list;
    }
}
