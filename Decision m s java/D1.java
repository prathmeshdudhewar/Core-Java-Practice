// Q1. Write a Java program to check whether a number is even or odd.
	 
	 import java.util.Scanner;
	 
	 public class D1
	 {
	   public static void main (String x[])
	   {
	       Scanner sc = new Scanner (System.in);
		   
		   System.out.println ("Enter  the number ");
		   
		   int no1 = sc.nextInt();
		   
		   if (no1%2==0)
		   {
		   System.out.println( "number is even");
		   
		   }
		   else 
		   {
		   System.out.println("number is odd");
		   }
	   }
	 }
