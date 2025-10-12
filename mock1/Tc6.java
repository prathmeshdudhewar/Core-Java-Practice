import java.util.Scanner;

public class Tc6
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if number is multiple of both 3 and 5
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is a multiple of both 3 and 5");
        } else {
            System.out.println(number + " is NOT a multiple of both 3 and 5");
        }

       
    }
}
