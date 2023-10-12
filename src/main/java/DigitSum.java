import java.util.Scanner;

/*public class DigitSum {
    public static void main(String[] args) {
        int n=0;
        int answer=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (n !=0){ // n이0이 아닐 때 까지 반복, 0이 나오면 자리 수를 메길 수 없어 종료
            answer += n%10;
            n/=10; // 일의 자리 수 제거 및 십의 자리수로 넘어감. n이 0이 될 때 까지 반복
        }
        System.out.println(answer);
    }
}

public class DigitSum {
    public static void main(String[] args) {
        DigitSum d = new DigitSum();
        System.out.println(d.voidsum());
    }
    private static int voidsum(){
        int n=0;
        int answer=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (n!=0){
            answer+=n%10;
            n/=10;
        }
        return answer;
    }
}*/

public class DigitSum {
    public static void main(String[] args) {
        DigitSum d = new DigitSum();
        System.out.println(d.voidsum());
    }

    private static int voidsum() {
        int n=0;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

