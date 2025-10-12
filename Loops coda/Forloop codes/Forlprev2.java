import java.util.Scanner;

public class Forlprev2
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int no, rev = 0, rem;

        System.out.println("Enter number from keyboard:");
        no = sc.nextInt(); // assign input to 'no'

        for (; no != 0; )
		{
            rem = no % 10;      // get last digit
            no = no / 10;       // remove last digit
            rev = rev * 10 + rem; // build reversed number
        }

        System.out.printf("Reverse is %d\n", rev);
        
    }
}
