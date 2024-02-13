package model.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nhsss
 */
public class QuizList {

    public  final int MAX_QUESTION = 100;
    private List<Quiz> quizList = new ArrayList<>();

    public QuizList() {
    }

    public List<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(List<Quiz> quizList) {
        this.quizList = quizList;
    }

    public void addQuiz() {
        Random random = new Random();

        int a, b, c, d;
        for (int i = 0; i < MAX_QUESTION; i++) {
            a = random.nextInt(99) + 1;
            b = random.nextInt(99) + 1;
            c = random.nextInt(3) + 1;
            String s = "Question: (" + a + " + " + b + " ) * " + c + " = ?";
            d = (a + b) * c;
            Quiz q = new Quiz(s, d);
            quizList.add(q);
        }

    }

}
