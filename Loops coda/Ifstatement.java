//wap to input number check number is even or odd using simple statement

import java.util.*;
public class Ifstatement
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
	 if (no%2 == 1)
	 {
	  System.out.println("Number is Odd");
	 }
	}
}