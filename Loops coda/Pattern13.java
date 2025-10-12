public class Pattern13
{
	public static void main(String x[])
	 {
	   int n = 7;
	    
	    for(int i = n; i >=1; i--)
		{
		  System.out.print("\t");
		   for(int j = 1; j <= i; j++)
		   {
		      System.out.print("*");
		   }
		    System.out.println();
		}
		   for(int i = 2; i <=n; i++)
		{
		  System.out.print("\t");
		   for(int j = 1; j <= i; j++)
		   {
		      System.out.print("*");
		   }
		    System.out.println();
		}
		    
	 }
}