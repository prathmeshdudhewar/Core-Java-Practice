public class RadiusAPP
	  {
		  public static void main(String x[])
		  {
			  int radius = Integer.parseInt(x[0]);
			  int dia = 2 * radius;
			  double cir = 2 * 3.14 * radius ;
			  double  area =  3.14 * radius * radius ;
			  
			  System.out.println (" diameter "+ dia);
			  System.out.println (" circumference"+ cir );
			  System.out.println("area"+ area );
			  
	      }
	  }