package programming_challenge;

import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int student_score = scanner.nextInt();
        
        Score score = new Score(student_score);

        System.out.println("Your grade is: " + score.getGrade());
        scanner.close();
    }
}

class Score {

    double score_value;

    Score(double score_value) {
        this.score_value = score_value;
    }

    String getGrade() {
        if (score_value >= 90 && score_value <= 100) {
            return "A";
        } else if (score_value >= 80 && score_value <= 89) {
            return "B";
        } else if (score_value >= 70 && score_value <= 79) {
            return "C";
        } else if (score_value >= 60 && score_value <= 69) {
            return "D";
        } else if (score_value >= 0 && score_value <= 59) {
            return "F";
        } else {
            return "Invalid score";
        }
    }
}