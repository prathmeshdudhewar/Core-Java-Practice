//sum of digit

import java.util.Scanner;

public class Tc5
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        int digit1 = num % 10;          // Last digit
        int digit2 = (num / 10) % 10;   // Second digit
        int digit3 = (num / 100) % 10;  // First digit

        int sum = digit1 + digit2 + digit3;

        System.out.println("Sum of digits: " + sum);
        
    }
}

