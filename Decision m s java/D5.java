// Write a Java program to check whether a number is divisible by 5 and 11 or not.
		
		import java.util.Scanner;
		
		public class D5
		{
			public static void main (String x[])
			{
				Scanner sc = new Scanner (System.in);
				
				System.out.println("Enter the number ");
				int no = sc.nextInt();
				
				if (no%5==0)
				{
					System.out.println("divisiblr=e by 5");
				}
				else if (no%11==0)
				{
					System.out.println("divisible by 11");
					
				}
				else 
				{
					System.out.println("not divisible by both");
					
				}
			}
		}
