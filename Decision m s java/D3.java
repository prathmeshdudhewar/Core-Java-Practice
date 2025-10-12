 //Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.
	 
	   import java.util.Scanner;
		
		public class 
		{
	      public static void main (String x[])
		  {
			  Scanner sc = new Scanner (System.in);
			  
			  System.out.println("enter the side of triangle ");
			  int a = sc.nextInt();
			  int b = sc.nextInt();
			  int c = sc.nextInt();
			  
			  if (a==b && b==c )
			  {
				  System.out.println("equalateral ");
			  }
			  else if (a==b || b== c || c==a)
			  {
				  System.out.println("isoscalen");
				  
			  }
			  else
			  {
				  System.out.println("scalen");
			  }
		  }
		}
