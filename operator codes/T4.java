// Triangle is equilateral, isoscale , or scalen

import java .util.*;
public class T4
{
	public static void main(String x[])
	{
		Scanner sc = new scanner(System.in);
		System.out.println(Enter the triangle );
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String result = (a==b && b==c)? "Equilateral":(a==b || b==c || a==c)? "Isoscales":"scalen";
		
		System.out.println("the triangle is"+result);
		
	}
	
	
}
		