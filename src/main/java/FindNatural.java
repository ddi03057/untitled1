import java.util.Scanner;

public class FindNatural { // 나머지가 1이되는 가장 작은 자연수 찾기
    public static void main(String[] args) {
        int answer = 0;
        int n;
        Scanner scanner =new Scanner(System.in); // scanner 에 입력받고자 하는 행위로 콘솔창에 사용자가 임의로 값 부여
        n = scanner.nextInt();//사용자가 임의로 변수를 집어 넣기 위해 메서드를 활용하여 int로 변환하여 주입
        for (int x=2; x<n; x++){ //n을 x로 나누어서 해당되는 값 찾기 위한 반복문
            if(n%x==1){
                answer =x;
                break;
            }
        }
        System.out.println(answer);
    }
}
