// calculate its factorial

import java.util.*;
public class Lp7
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no ,f =1;
		
		System.out.println("Enter Number");
		int n =xyz.nextInt();
		
		while(no!=0)
		{
			f=f*no;
			--no;
			
		System.out.printf("factorial of no is %d\n"+f);
		
		}
		
	}
}
	