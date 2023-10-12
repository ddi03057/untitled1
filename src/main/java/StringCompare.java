import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a = "치킨";
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine(); // 엔터단위로 저장 cf) next() : 공백 단위

        System.out.println(a.equals(b)); // a==b 하면 문자열의 같음을 판단할 때 글자의 같음 만울 파기, string값은 메모리값에서 값이 저장된 위치 확인
    }
}
