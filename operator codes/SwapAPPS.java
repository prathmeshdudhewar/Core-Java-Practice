// Q15. Write a java program swap two number without using third variable.	
	 import java.util.*;
	      public class SwapAPPS
		  {
			  public static void main(String[] args)
			  {
				  Scanner scn = new Scanner(System.in);
				  System.out.println("Enter the first number :");
				  int a=scn.nextInt();
				  
				  System.out.println("Enter second number :");
				  int b=scn.nextInt();
				  
				  System.out.println("print before Swapping :");
				  
				  a = a+ b;
				  b = a - b ;
				  a = a-b ;
				  System.out.println("After Swaping "   + a+ " a " );
				   System.out.println("After Swaping "  +b+ "b" );
			  }
		  }
