import java.util.*;
	  public class T2
	  {
		  public static void main (String x[])
		  {
			  Scanner sc = new Scanner (System.in);
			  
			  System.out.println("Enter the triangle sige ");
			  // sum of any two sides is greater than the third side.
			  int a = sc.nextInt();
			  int b = sc.nextInt();
			  int c = sc.nextInt();
			  
			  String result = ( a + b > c && a + c > b && b + c > a ) ? "valid " : "not Vaild " ;
			  System.out.println("The triangle is vaild or not is :"+ result);
			  
		  }
	  }
