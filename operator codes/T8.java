import java.util.*;
		public class T8
		{
			public static void main (String x[])
			{
				Scanner sc = new Scanner (System.in);
				System.out.println("enteer the marks ");
				
				int marks = sc.nextInt();
				
				String result = marks >= 90 ? "excellent" : marks >=  75 ? "good " : marks >= 50 ? "avarage" : "poor";
				
				System.out.println("the obtain result is"+ result);
				
				
			}
		}
		
