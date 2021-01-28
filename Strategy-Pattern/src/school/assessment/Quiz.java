package school.assessment;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<Question>();
    }

    /* add a question to the quiz*/
    public void add(Question question) {
        questions.add(question);
    }

    /*return the number of correct answers in the parameter*/
    public int grade(ArrayList<String> answers) {
        int grade = 0;
        for (int i = 0; i < questions.size(); i++) {
            String ans = answers.get(i);
            if (ans != null && questions.get(i).mark(ans)) {
                grade += 1;
            }
        }
        return grade;
    }
}
