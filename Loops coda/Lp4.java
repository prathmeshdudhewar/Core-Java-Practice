// Wap to input number from keyboard and print ist

//5*1....etc

import java .util.*;
public class Lp4
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no,tab,i;
		
		System.out.println("Enter number fro, keyboard");
		int n = xyz.nextInt();
		
		
		i = 1;
		while(i<=10)
		{
		 tab = n*i;
		 
		 System.out.printf("%d\n",tab);
		 
		 i++;
		 
		}
		
	}
	
}