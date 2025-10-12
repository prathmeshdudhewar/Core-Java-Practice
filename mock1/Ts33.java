import java.util.Scanner;
		
		public class Ts33
		{
			public static void main (String x[])
			{
				Scanner sc = new Scanner (System.in); 
				
				System.out.println("Enter the number "); 
				int no = sc.nextInt();
				
				if (no%5==0)  // condition the number of mod 5
				{
					System.out.println("divisiblr=e by 5"); // print divisible 5
				}
				else if (no%11==0) //  the number of mod 11
				{
					System.out.println("divisible by 11"); // divisible by 11
					
				}
				else 
				{
					System.out.println("not divisible by both"); // not divisible
					
				}
			}
		}
