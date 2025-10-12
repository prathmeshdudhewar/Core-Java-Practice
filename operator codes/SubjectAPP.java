 import java.util.*; 
     

	 public class SubjectAPP
	   {
		   public static void main (String x[])
		   {
			   
			   Scanner sc = new Scanner(System.in);
			   
			   System.out.println("enter the marks of 1st sub");
			   int sub1 = sc.nextInt();
			   
			   System.out.println("Enter the marks of 2nd sub");
			   int sub2 = sc.nextInt();
			   
			   System.out.println("Enter the marks of 3rd sub");
			   int sub3 = sc.nextInt();
			   
			   System.out.println("Enter the marks of 4th sub");
			   int sub4 = sc.nextInt();
			   
			   System.out.println("Enter the marks of 5th sub ");
			   int sub5 = sc.nextInt();
			   
			   int total = sub1 + sub2 +sub3+sub4 +sub5;
			   float percent =  (total/ 500)*100;                     //        problem in this formula 
			   
			   System.out.println("total marks of the sub is" + total);
               System.out.println("percentage of  total marks is " + percent );
			   
			  
			   
		   }
	   }	   
