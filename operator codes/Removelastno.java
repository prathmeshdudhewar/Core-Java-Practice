// four digit number and removes last digit from no


import java.util.*;
public class Removelastno
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int no = sc.nextInt();
	System.out.println("Before digit deletion" + no);
	
	no = no/10;
	System.out.println("After digit deletion" + no);
	
  }
  
}
  