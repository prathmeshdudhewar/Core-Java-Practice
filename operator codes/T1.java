//number is even or not

import java.util.*;
	  public class T1
	  {
		public static void main (String x[])
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the number ");
			int no = sc.nextInt();
		 
		 
			String result = no % 2== 0  ? "even" : "odd";
			System.out.println("the number is even or odd "+ result);
        }
	  }
