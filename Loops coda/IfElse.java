// else

import java.util.*;
public class IfElse
{
	public static void main(String x[])
	{
	 Scanner xyz = new Scanner(System.in);
	 int no;
	 System.out.println("Enter number");
	 no = xyz.nextInt();
	 
	 if(no%2 == 0)
	 {
	  System.out.println("Number is Even");
	 } 
	 else
	 {
	  System.out.println("Number is Odd");
	 }
	}
}
