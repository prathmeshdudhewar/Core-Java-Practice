public class FibonacciDemo {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        // 10 numbers print
        for(int i = 1; i <= 10; i++) {

            System.out.print(a + " ");

            // Draw the next numbers
            int c = a + b;

            a = b;
            b = c;
        }
    }
}