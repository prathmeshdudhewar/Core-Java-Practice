import java.util.*;

public class Leapyear
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in); // Scanner object

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        String result = (year % 400 == 0) ? "Leap Year" :
                        (year % 100 == 0) ? "Not a Leap Year" :
                        (year % 4 == 0) ? "Leap Year" : "Not a Leap Year";

        System.out.println("The entered year is: " + result);
    }
}
