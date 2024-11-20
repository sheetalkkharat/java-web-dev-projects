package org.example;

public class MultipleChoice extends Question {
    private String options;

    public MultipleChoice(String text, String userInput, int points, String correctAnswer, String options) {
        super(text, userInput, points, correctAnswer);
        this.options = options;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void displayQuestion() {
        System.out.println(this.getText());

        System.out.println(options);
    }
}
