public class Pattern5
{
	public static void main(String x[])
	{
		int rows = 5;
		int cols = 9;
		 for(int i = 1; i <= rows; i++)
		  {
		    for(int j = 1; j < cols; j++)
			 {
				System.out.print(" * ");
			 }
			   for(int k = 1; k<= (2 * i-1); k++)
			   {
			     System.out.print("*");
				}
				 System.out.println();
			 
		  }
	}
}	