import java.util.Scanner;

public class TriangleValidation 
	{
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for three sides of triangle
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // Decision-making statement to check validity
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The triangle is VALID.");
        } else {
            System.out.println("The triangle is NOT VALID.");
        }

        sc.close();
    }
}
