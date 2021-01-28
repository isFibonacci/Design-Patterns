package school.assessment;
import java.util.ArrayList;

public class MultipleChoice implements Question{
    private ArrayList<String> options;
    private String text,correct;

    /*
    *   The String text to display to the user taking the quiz/exam
        Ex: “On which continent is the country of India?”
        A List<String> for the possible answers to display
        Ex: {“Asia”, “Africa”, “Europe”}
        A String for the correct answer
        Ex: “Asia”
    * */
    public MultipleChoice(String text, ArrayList<String> options, String correct) {
        this.text = text;
        this.options = options;
        this.correct = correct;
    }

    /* compares it to the correct answer set in the constructor*/
    @Override
    public boolean mark(String ans) {
        return ans.equals(correct);
    }

    /*return a String with the text followed by each possible answer on a separate line*/
    @Override
    public String toString() {
        String result = text;
        int i = 1;
        for (String option: options) {
            String optionNumber = String.valueOf(i);
            result += "\n" + optionNumber + ". " + option;
            i++;
        }
        return result;
    }
}
