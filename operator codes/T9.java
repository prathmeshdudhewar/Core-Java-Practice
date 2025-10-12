 Write a Java program to check whether a year is leap year or not.
		
	import java.util.*;
		public class T9
		{
			public static void main (String x[])
			{
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter the year");
				
				int year = sc.nextInt();
				
				String result =  ( year %400== 0 )? "leap year":
				                  ( year %100== 0) ? "not leap year":
								  (year %4==0)? "leap year ":"not leap year";
			System.out.println("the enter value is leap year or not we now is :"+ result);				  
			}
		}
	   
	   
