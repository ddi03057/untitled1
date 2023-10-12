import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //(system.in) : 콘솔창에서 입력한 데이터
        System.out.println("정수를 입력하세요 :");
        int i = sc.nextInt(); // 사용자가 입력한 데이터를 변수 i에 저장
        System.out.println("입력된 정수는 " + i + " 입니다.");
        sc.close(); // 입출력을 닫는 방식으로 프로그램 종료

    }
}
//Scanner scanner = new Scanner(System.in)