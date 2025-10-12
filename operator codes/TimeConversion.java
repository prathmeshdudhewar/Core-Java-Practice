import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total seconds
        System.out.print("Enter total seconds: ");
        int totalSeconds = sc.nextInt();

        // Conversion
        int hours = totalSeconds / 3600;          // 1 hour = 3600 seconds
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;      // 1 minute = 60 seconds
        int seconds = remainingSeconds % 60;

        // Output
        System.out.println("Time is: " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)");

        sc.close();
    }
}
