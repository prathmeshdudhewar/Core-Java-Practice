import java.util.*;  // Required for Scanner

public class T5
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in); // Corrected 'scanner' to 'Scanner'

        System.out.println("Enter the sides of the triangle: "); // Added quotes for the message
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Determine the type of triangle
        String result = (a == b && b == c) ? "Equilateral" : 
                        (a == b || b == c || a == c) ? "Isosceles" : 
                        "Scalene";

        System.out.println("The triangle is: " + result);
    }
}
