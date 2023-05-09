import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of courses: ");
        int numCourses = input.nextInt();

        double totalGradePoints = 0.0;
        double totalCredits = 0.0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.print("Enter the credit hours for course " + i + ": ");
            int credits = input.nextInt();
            System.out.print("Enter the grade for course " + i + " (A, B, C, D, or F): ");
            String grade = input.next();

            double gradePoints = 0.0;
            switch (grade) {
                case "A":
                    gradePoints = 4.0;
                    break;
                case "B":
                    gradePoints = 3.0;
                    break;
                case "C":
                    gradePoints = 2.0;
                    break;
                case "D":
                    gradePoints = 1.0;
                    break;
                case "F":
                    gradePoints = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade entered. Please try again.");
                    i--;
                    continue;
            }

            double coursePoints = gradePoints * credits;
            totalGradePoints += coursePoints;
            totalCredits += credits;
        }

        double gpa = totalGradePoints / totalCredits;
        System.out.println("Your GPA is " + gpa);
    }
}
