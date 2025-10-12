import java.util.Scanner;

public class Tc2 
{
    public static void main(String[] args)  
	{
        Scanner sc = new Scanner(System.in);

        // Display Menu
        System.out.println("===== MENU =====");
        System.out.println("1. Check Number is Positive, Negative or Zero");
        System.out.println("2. Check Number is Even or Odd");
        System.out.println("3. Find Maximum Between Two Numbers");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Positive, Negative or Zero
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                if (num > 0) {
                    System.out.println(num + " is Positive.");
                } else if (num < 0) {
                    System.out.println(num + " is Negative.");
                } else {
                    System.out.println("The number is Zero.");
                }
                break;

            case 2:
                // Even or Odd
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    System.out.println(n + " is Even.");
                } else {
                    System.out.println(n + " is Odd.");
                }
                break;

            case 3:
                // Maximum of Two Numbers
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                if (a > b) {
                    System.out.println("Maximum number is: " + a);
                } else if (b > a) {
                    System.out.println("Maximum number is: " + b);
                } else {
                    System.out.println("Both numbers are equal.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        
    }
}
