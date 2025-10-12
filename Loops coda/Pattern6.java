public class Pattern6
{
	public static void main(String x[])
	{
	 
	  int i,j;
	  for(i=1; i<=5; i++)
	   {
	     for(j=1; j<=5; j++)
		  {
			if(i==1 || j==1 || i==5 || j==5||j==i)
			  System.out.print(" * ");
			   else
			     System.out.print("   ");
				 
		  }
		   System.out.println("");
		   
		}
		
	}
	
}
		  
				 