
package StudentGradeCalculater;
import java.util.Scanner;

public class studentgradecalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        String[] subjects = {"English", "Maths", "Science", "Language", "Social Science"};

        System.out.println("\nSTUDENT GRADE CALCULATOR");
        System.out.println("...........................");

        int[] marks = new int[subjects.length];
        System.out.println("\nEnter marks obtained in each subject (out of 100):");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(subjects[i] + ": ");
            int mark = scanner.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Alert: The mark entered for " + subjects[i] + " is wrong. Please enter a mark between 0 and 100.");
                i--; 
            } else {
                marks[i] = mark;
            }
        }

        int totalMarks = calculateTotalMarks(marks);

        double averagePercentage = calculateAveragePercentage(totalMarks, marks.length);

        char grade = calculateGrade(averagePercentage);

        displayResults(studentName, subjects, marks, totalMarks, averagePercentage, grade);

        if (grade == 'F') {
            System.out.println("Sorry, " + studentName + ", you have received an F grade.");
        } else {
            System.out.println("Congratulations, " + studentName + ", you have passed!");
        }

    }

    private static int calculateTotalMarks(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    private static double calculateAveragePercentage(int totalMarks, int numOfSubjects) {
        return (double) totalMarks / numOfSubjects;
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else if (averagePercentage >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    private static void displayResults(String studentName, String[] subjects, int[] marks, int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("\nSubject-wise Marks:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
