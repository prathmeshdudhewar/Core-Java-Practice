public class Swap 
{
    public static void main(String[] args) 
	{

        // Initialize two variables
        int a = 10, b = 20;

        // Add both numbers and store in a
        a = a + b;   // a = 30

        // Subtract b from a to get original value of a
        b = a - b;   // b = 10

        // Subtract new b from a to get original value of b
        a = a - b;   // a = 20

        // Print swapped values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}