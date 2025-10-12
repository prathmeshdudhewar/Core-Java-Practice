// Calculate sum of all natural numbers between 1 to 10


public class Lpp6
{
    public static void main(String[] args)
	{
        int i = 1, sum = 0;

        while (i <= 10) 
		{
            sum = sum + i;     // OR sum += i;
            i++;
        }

        System.out.printf("Sum of all values between 1 and 10 is %d\n", sum);
    }
}

