//Meterkilometer

import java.util.*;
public class Meterkilometer
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.print("Enter a length centimeter");
	  double cm=sc.nextDouble();
	  
	  double meter=cm/100;
	  double kilometer=cm/10000;
	  
	  System.out.println("meter is length:" +meter);
	}
}
	