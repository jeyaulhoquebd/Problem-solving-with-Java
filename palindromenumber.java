public class palindromenumber {
    public static boolean ispalindrome(int num){
        if (num < 0) return false;


        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /=10;
        }
    }
}
