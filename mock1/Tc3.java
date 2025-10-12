import java.util.Scanner;

public class Tc3
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the sales amount: ");
        double sales = sc.nextDouble();
        double commission;

        // Logic
        if (sales < 5000) {
            commission = sales * 0.02;  // 2%
        } else if (sales <= 10000) {
            commission = sales * 0.05;  // 5%
        } else {
            commission = sales * 0.10;  // 10%
        }

        // Output
        System.out.println("The commission amount is: " + commission);

        
    }
}
