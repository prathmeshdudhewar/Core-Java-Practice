//Wap natural no n in while loop



import java.util.Scanner;

public class NaturalNumbers1
 {
   
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int i = 1; // starting number

        // while loop to print natural numbers
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        
    }
}