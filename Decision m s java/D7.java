
		// Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.
		
		import java.util.Scanner;
		public class D7
		{
			public static void main(String x[])
			{
				Scanner sc = new Scanner (System.in);
				
				System.out.println("Enter the selling");
				int selling = sc.nextInt();
				System.out.println("Enter the cost");
				int cost = sc.nextInt();
				
				if (selling > cost)
				{
					System.out.println("profit");
					
				}
				else 
				{
					System.out.println("loss");
					
				}
			}
		}
