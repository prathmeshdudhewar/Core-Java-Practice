import java.util.*;

public class Lpp7
{
    public static void main(String[] args)
	{
        Scanner xyz = new Scanner(System.in);

        int no, f = 1;

        System.out.println("Enter Number:");
        no = xyz.nextInt();       // Read the number

        int temp = no;          // To keep original number for display

        while (no != 0)
		{
            f *= no;    // Multiply
            no--;          // Decrement number
        }

        System.out.printf("Factorial of %d is %d\n", temp, f);
    }
}
