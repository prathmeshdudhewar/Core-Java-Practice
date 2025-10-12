public class PAT3
{
    public static void main(String x[])
    {
        int i, j;
        for (i = 1; i <= 5; i++)
        {
            for (j = 1; j <= 5; j++)
            {
                if (i == 1 || i == 5 || j == 1 || j == 5)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();  // पुढच्या line साठी
        }
    }
}
