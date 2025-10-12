// Write a Java program to check whether a number is positive , negative or zero
		
		import java.util.Scanner;
		public class D4
		{
			public static void main(String x[])
			{
				Scanner sc = new Scanner (System.in);
				System.out.println("enter the number ");
				
				int no = sc.nextInt();
				if (no > 0)
				{
					System.out.println("Positive ");
					
					
				}
				else if (no < 0)
				{
					System.out.println("Negative");
					
				}
				else
				{
					System.out.println("zero");
				}
			}
		}
	