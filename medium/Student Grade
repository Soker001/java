import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for four subjects
        System.out.print("Enter the marks in Python: ");
        int pythonMarks = scanner.nextInt();

        System.out.print("Enter the marks in C Programming: ");
        int cProgrammingMarks = scanner.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter the marks in Physics: ");
        int physicsMarks = scanner.nextInt();

        // Calculate total marks and aggregate
        int totalMarks = pythonMarks + cProgrammingMarks + mathMarks + physicsMarks;
        double aggregate = totalMarks / 4.0;

        // Determine grade
        String grade;
        if (aggregate > 75) {
            grade = "DISTINCTION";
        } else if (aggregate >= 60) {
            grade = "FIRST DIVISION";
        } else if (aggregate >= 50) {
            grade = "SECOND DIVISION";
        } else if (aggregate >= 40) {
            grade = "THIRD DIVISION";
        } else {
            grade = "FAIL";
        }

        // Display total, aggregate, and grade
        System.out.println("Total = " + totalMarks);
        System.out.println("Aggregate = " + aggregate);
        System.out.println(grade);

        scanner.close();
    }
}
