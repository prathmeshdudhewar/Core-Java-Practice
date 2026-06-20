public class PrimeNumberDemo 
{
    public static void main(String[] args) 
	{

        // Number to check
        int num = 13;

        // Assume number is prime
        boolean isPrime = true;

        // Check divisibility from 2 to num-1
        for(int i = 2; i < num; i++) 
		{

            // If perfectly divisible, it is not prime
            if(num % i == 0) 
			{
                isPrime = false;
                break; // Exit loop immediately
            }
        }

        // Display result
        if(isPrime) 
		{
            System.out.println("Prime Number");
        } else 
		{
            System.out.println("Not Prime Number");
        }
    }
}