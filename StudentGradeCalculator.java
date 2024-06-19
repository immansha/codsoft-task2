import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int NUM_SUBJECTS = 5; // Assuming there are 5 subjects

        // Array to store marks obtained in each subject
        int[] marks = new int[NUM_SUBJECTS];

        // Input marks obtained in each subject
        System.out.println("Enter marks (out of 100) for each subject:");
        for (int i = 0; i < NUM_SUBJECTS; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / NUM_SUBJECTS;

        // Determine grade based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Results:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
