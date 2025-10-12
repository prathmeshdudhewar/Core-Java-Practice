import java.util.*;

public class Tc1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

          // Input marks of five subjects
        System.out.println("Enter marks for Physics:");
        int physics = sc.nextInt();

        System.out.println("Enter marks for Chemistry:");
        int chemistry = sc.nextInt();

        System.out.println("Enter marks for Biology:");
        int biology = sc.nextInt();

        System.out.println("Enter marks for Mathematics:");
        int maths = sc.nextInt();

        System.out.println("Enter marks for Computer:");
        int computer = sc.nextInt();

          // Calculate total and percentage
        int total = physics + chemistry + biology + maths + computer;
        double percentage = (total / 500.0) * 100;

        System.out.println("\nTotal Marks: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Determine grade using conditions
        String grade;
        if (percentage >= 90) {
            grade = "Excellent";
        } else if (percentage >= 75) {
            grade = "Good";
        } else if (percentage >= 50) {
            grade = "Average";
        } else {
            grade = "Poor";
        }

        System.out.println("Grade: " + grade);
        
        
    }
}
