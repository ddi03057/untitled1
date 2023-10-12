import java.util.Scanner;

public class StringIndex {
    public static void FindIndex(){
        String origin = null;
        char search='\u0000'; // char 유형 필드의 기본값
        char arr[]= null;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요 : ");
        origin=scanner.nextLine();

        System.out.println("검색할 문자를 입력하세여 : ");
        search=scanner.nextLine().charAt(0); // charAt():String으로 저장된 문자열 중 한글자만 char로 변환 용도
        // 입력할 문자열의 길이만큼 배열의 길이를 가지는 arr 배열 생성
        arr=new char[origin.length()];
    }
}
