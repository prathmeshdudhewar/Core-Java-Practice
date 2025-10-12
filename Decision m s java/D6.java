// Write a Java program to check whether a character is alphabetic or not.
		
		import java.util.Scanner;
		public class D6
		{
			public static void main (String x[])
			{
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter the character ");
			   char ch = sc.next().charAt(0);
			   if (ch >= 'a' && ch <= 'z'|| ch >= 'A'&& ch <= 'Z')
			   {
				   System.out.println("this is alphabet ");
				   
			   }
			   else 
			   {
				   System.out.println("not ");
			   }
			}
		}
