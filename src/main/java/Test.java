import java.util.Scanner;

public class Test {
    //find number of max digits in a number
    public static int findMaxDigits(int num) {
        int maxDigits = 0;
        while (num > 0) {
            num /= 10;
            maxDigits++;
        }
        return maxDigits;
    }
    // execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(findMaxDigits(num));
    }
}