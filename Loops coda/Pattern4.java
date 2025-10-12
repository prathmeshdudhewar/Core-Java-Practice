public class Pattern4
{
	public static void main(String x[])
	{
	  int rows = 5;
	  
	  
	  for(int i = 1; i<=5; i++) 
	  {
	    for(int j = 0; j<i; j++)
		{
		  if (j % 2 == 0)
		  {
		     System.out.print("#\t");
		  }
           else
		   {
		      System.out.print("*\t");
		   }
		}
		 System.out.println();
		 
	  }
	}
}	
		   
		   