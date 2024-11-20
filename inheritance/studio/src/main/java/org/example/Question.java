package org.example;

import java.util.Scanner;

public class Question {
    private String text;
    private String userInput;
    private int points;
    private String correctAnswer;

    public Question(String text, String userInput, int points, String correctAnswer) {
        this.text = text;
        this.userInput = userInput;
        this.points = points;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void getUserAnswer() {
        Scanner input = new Scanner(System.in);
        this.setUserInput(input.nextLine());
    }

    // Next compare user answer with correct answer
    // And we could display right or wrong?

    public void checkAnswer() {
        if (this.getUserInput().equals(this.getCorrectAnswer())) {
            System.out.println("Good answer!");
        } else {
            System.out.println("Sorry, that's wrong.");
        }
    }
}
