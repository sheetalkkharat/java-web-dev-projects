package org.example;

public class QuizRunner {
    public static void main(String[] args) {
        MultipleChoice firstQuestion = new MultipleChoice("Question 1 What is blahb",
                "", 5, "b",
                "a. sldkjfljf b. slkjlkjf c. slkjdflskjd d. slkdjlskjdf");

        // this logic will eventually move to Quiz
        firstQuestion.displayQuestion();
        firstQuestion.getUserAnswer();
        firstQuestion.checkAnswer();

    }
}
