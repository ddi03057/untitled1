import java.util.Scanner;

/*public class Factorial { // 1!부터 10!까지의 덧셈을 입력 받아 출력
    public static void main(String[] args) {
        int n=5;

         우선 factorial 은 n 이하의 숫자들의 차례곱. 따라서 알고리즘읠 정의하면 우선 i,n을 정의하고 n의 범위를 i보다 큰 경우 빠져나오는 for 문 작성
        이 때 반복문 실행 할 떄 i와 n을 곱하고 이 곱한 값들을 저장하여 덧셈하고 for 문 탈출하면서 결과 출력.
        for (int i=1; i<=10; i++){
            for (int j=1; j<=i; j++){
                if(i>1){
                    n=n-1;
                }
                } else
            {
                break;
            }
        }
        System.out.println(n + "!");
    }
}
*/

public class Factorial {
    public static void main(String[] args) {
        Factorial result = new Factorial();
        result.math();
    }
    private void math() {
        int n = 6;
        int sum = 1;  // 곱셈이라 초기값 1
        for (int i = 1; i <= n; i++) {
            sum = sum * i; // n부터 1까지 곱셈 반복, 반복 시 값은 자동으로 덧셈
        }
        System.out.println(n + "!의 덧셈 = " + sum);
    }
}


