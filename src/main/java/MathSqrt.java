import java.util.Scanner;

public class MathSqrt { // 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하고자 n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 아닐 시 -1리턴
    public static void main(String[] args) {
        long n;
        long answer=0;
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextLong();
        double x=Math.sqrt(n); // scannner 에서 값을 입력 받을 때 먼저 입력 받고 연산식을 선언 하던가 변환을 하던가 해야지 이 코드가 scanner 보다 앞 줄에서 작성되면 연산된 값이 초기화 되지 못하고 무한 반복

        if(Math.sqrt(n)%1==0){ // n의 제곱근
            answer = (long)(Math.pow(x+1,2));
        }else{
            answer = -1;
        }
        System.out.println(answer);
    }
}
