// Q9. Write a java program to input any alphabet and check whether it is vowel or consonant
			
			import java.util.Scanner;
			
			public class D8
			{
				public static void main (String x[])
				{
					Scanner sc = new Scanner (System.in);
					System.out.println("Enter the character ");
					
					char ch = sc.next().charAt(0);
					
					if (ch=='a' && ch== 'e' && ch=='i' && ch=='o' && ch=='u')
					{
					System.out.println("Vowel");
					}
					else 
					{
						System.out.println("consonant");
					}
					
				}
			}
