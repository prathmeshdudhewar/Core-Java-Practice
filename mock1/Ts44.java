import java.util.*;
public class Ts44
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);   // FIXED: 'scanner' → 'Scanner' (capital S)
        
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        
        // Ternary operator used correctly
        String result = (marks >= 90) ? "excellent" :
                        (marks >= 75) ? "good" :
                        (marks >= 50) ? "average" : "poor";
        
        // FIXED: Variable name changed from 'res' to 'result', added proper closing parenthesis
        System.out.println("The obtained result is: " + result);
    }
}
