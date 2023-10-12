import java.util.Scanner;

/*public class HarShard { // 정수 n과 n의 자릿수를 더한 값을 나눴을 때 나머지가 0이 되는지 확인
    public static void main(String[] args) {
        int n=21;
        int sum=0;
        int a=n; // 만일 n으로 while문 돌리면 자꾸 0이 튀어나와서 이를 방지하기 위해 새로운 변수를 선언하여 방지

        while (a>0){
            sum += a%10;
            a=a/10;
        }
        System.out.println(sum);
        System.out.println(n%sum==0?true:false);
    }
}*/

public class Harshard { // 주어진 진법에서 그 수의 각 자릿수 숫자의 합으로 그 수가 나누어지는 양의 정수를 말한다.
    //자기자신이 각 자리 숫자의 합의 몇배가 되어 약수와 배수의 관계가 되는 수
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        i= scanner.nextInt();
        int a=i;

        while (a>0){
            sum += a%10;
            a/=10;
        }
        System.out.println(i%sum==0?true:false);
    }
}