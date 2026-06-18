public class TernaryDemo 
{
    public static void main(String[] args)
	{

        // Store age of person
        int age = 20;

        // Check eligibility using ternary operator
        // If age is 18 or above -> Eligible
        // Otherwise -> Not Eligible
        String result = (age >= 18) ? "Eligible" : "Not Eligible";

        // Print result
        System.out.println(result);
    }
}