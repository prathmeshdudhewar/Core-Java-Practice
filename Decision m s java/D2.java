// Q2. Write a Java program to check whether a triangle is valid or not.
	 

	 import java.util.Scanner;
	 
	 public class D2
	 {
		 public static void main (String x[])
		 {
			 Scanner sc = new Scanner (System.in);
			 System.out.println(" enter the side of triangle ");
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 int c = sc.nextInt();
			 
			 if (a + b > c && a + c >b  && c + b > a )
			 {
				 System.out.println("this is vaild triangle ");
				 
			 }
			 else 
			 {
				 System.out.println("not  vaild triangle ");
				 
			 }
		 }
	 }
	 
