public class PalindromeDemo 
{
    public static void main(String[] args) 
	{

        int num = 121;
        int original = num;
        int reverse = 0;

        while(num > 0) {

            // remove the last digit
            int digit = num % 10;

            // reverse build
            reverse = reverse * 10 + digit;

            // last digit remove
            num = num / 10;
        }

        if(original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}