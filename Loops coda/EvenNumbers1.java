// 1 to 100 Even number

public class EvenNumbers1
{
    public static void main(String x[]) 
	{
        int i = 1; // starting number

        System.out.println("Even numbers between 1 to 100:");

        while (i <= 100) 
		{
            if (i % 2 == 0) 
			{ // check if number is even
                System.out.println(i);
            }
            i++; // increment by 1
        }
    }
}
