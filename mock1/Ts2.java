import java.util.Scanner;
public class Ts2
{	
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in); //use to one character
		System.out.println("Enter the charcter");   //Input a single alphabet
		char ch = sc.next().charAt(0);
		
		if(ch=='a' || ch== 'e' || ch==  'i' || ch== 'o' || ch== 'u') //OR || operator use this condition
		{
			System.out.println(" Vowel"); // print Vowel
			
	    }
		
		else
		{
		  System.out.println("Constant");     //print constatn
		}
	}
	
}


