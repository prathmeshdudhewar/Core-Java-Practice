import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Display ASCII value
        int asciiValue = (int) ch;  // Type casting char to int
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        sc.close();
    }
}
