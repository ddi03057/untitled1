import java.util.Scanner;

/*public class divisor { // n의 약수들의 합
    public static void main(String[] args) {
        int n=0;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();

        for (int a=1; a<=n/2; a++) { // 모든 약수의 합을 answer 에 저장하기 위해 소수 중2가 가장 작은 성질을 이용하여 n/2
            if ((n % a) == 0) {
                answer +=a;
            }
        }
        System.out.println(answer+n);
    }
}


public class divisor {
    public static void main(String[] args) {
        int answer = 0;
        int n = 15; // n의 약수들의 합 구하기 위해 n의 값 변동

        for(int i= 1; i<=n;i++){
            if (n%i==0){answer+=i;}
        }
        System.out.println(answer);
    }
}*/

public class divisor {
    public static void main(String[] args) {
        int answer = 0;
        answer=divse(answer);
        System.out.println(answer);
    }
    private static int divse(int b){
        int n=10;
        for (int i=1; i<=n;i++){
            if(n%i==0){
                b+=i;
            }
        }
        return b;
    }
}
