// WAp to input number from keyboard and reverse it using for loop 

public class Forlprev
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no,  rev=0, rem;
		System.out.println("Enter number from keyboard");
		no = sc.nextInt();
		
		
		for(; no!=0 ;)
		
		{
			rem = no%10;
			no = no/10;
			rev=rev*10+rem;
		}
		
		System.out.printf("Reverse is %d\n" ,rev);
		
	}
	
	

}
			