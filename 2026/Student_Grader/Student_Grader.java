import java.util.Scanner;

public class Student_Grader {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Please Enter The Number of Students: ");
        int numberOfStudents = inputCollector.nextInt();

        System.out.print("How Many Subjects Do They Offer: ");
        int numberOfSubjects = inputCollector.nextInt();

        int[][] scores = new int[numberOfStudents][numberOfSubjects];

        for (int studentCounter = 0; studentCounter < numberOfStudents; studentCounter++) {
            System.out.println("\nEntering scores for Student " + (studentCounter + 1));

            for (int subjectCounter = 0; subjectCounter < numberOfSubjects; subjectCounter++) {
                int subjectScore;

                do {
                    System.out.print("Enter score for Subject " + (subjectCounter + 1) + ": ");
                    subjectScore = inputCollector.nextInt();

                    if (subjectScore < 0 || subjectScore > 100) {
                        System.out.println("Incorrect Input!! Please Re_Enter Your Score.");
                    }
                } while (subjectScore < 0 || subjectScore > 100);

                scores[studentCounter][subjectCounter] = subjectScore;
            }
        }

        System.out.println("\n===== THE SUMMARY CLASS SUMMARY INCLUDE =====");

        for (int studentCounter = 0; studentCounter < numberOfStudents; studentCounter++) {
            int totalScores = 0;

            for (int subjectCounter = 0; subjectCounter < numberOfSubjects; subjectCounter++) {
                totalScores += scores[studentCounter][subjectCounter];
            }

            double averageScorePerStudent = (double) totalScores / numberOfSubjects;
            System.out.printf(
                "Average score for Student %d: %.2f%n",
                studentCounter + 1,
                averageScorePerStudent
            );
        }

        for (int subjectCounter = 0; subjectCounter < numberOfSubjects; subjectCounter++) {
            int totalScores = 0;

            for (int studentCounter = 0; studentCounter < numberOfStudents; studentCounter++) {
                totalScores += scores[studentCounter][subjectCounter];
            }

            double averageScorePerSubject = (double) totalScores / numberOfStudents;
            System.out.printf(
                "Average score for Subject %d: %.2f%n",
                subjectCounter + 1,
                averageScorePerSubject
            );
        }

        inputCollector.close();
    }
}

