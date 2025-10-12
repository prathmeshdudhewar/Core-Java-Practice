		import java.util.Scanner;
		
		public class Ts3
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
