// Write a java program to display following series :
           	1  2  4  7  11  16  22  29  37  46.



public class NumberSeries 
{
    public static void main(String[] args)
	{
        int n = 10; // total terms
        int num = 1; // first term

        System.out.print("Series: ");

        for (int i = 1; i <= n; i++) 
		{
            System.out.print(num + " ");
            num = num + i; // next term = previous term + i
        }
    }
}
