import java.util.Scanner;

public class Tc7
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Using conditional operator to find minimum
        int min = (num1 < num2) ? num1 : num2;

           // Display result
        System.out.println("The minimum number is: " + min);

        
    }
}
