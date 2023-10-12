import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        System.out.println("음식 이름을 입력하세여");
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name){
            case " 치킨":
                System.out.println("치킨 은 500원");
                break;
            case "순대국":
                System.out.println("순대국은 8000원");
                break;
            case "스테이크":
                System.out.println("스테이크느 6900원");
            default:
                System.out.println("메뉴에 존재하지 않음");
        }
    }
}
