public class Pattern7
{
	public static void main(String x[])
	{
	  int n=6;
	  for(i=0; i<n; i++)
	   {
	     for(j=0; j<n; j++ )
		  {
			if(j == 1 || j == i || j == n-i-1 || j == n-1)
			{ System.out.print("*\t");
			}
			else
			{  System.out.print("\t");
			} 
		  }
		   System.out.println("");
		   
		}
		
	}
	
}
		  
				 