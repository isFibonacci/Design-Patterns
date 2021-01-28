package school.assessment;

public class FillIn implements Question{
    private String text;
    private String correct;

    /*A String for the correct answer*/
    public FillIn(String text,String correct) {
        this.text = text;
        this.correct = correct;
    }

    /*returns true if the parameter equals the correct answer, false if not*/
    @Override
    public boolean mark(String ans) {
        return ans.equals(correct);
    }

    /*The String text to display to the user taking the quiz/exam*/
    @Override
    public String toString() {
        return text;
    }
}
