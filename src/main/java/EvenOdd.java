import java.util.Scanner;

/*public class EvenOdd {
    public static void main(String[] args) {
        String answer = "";
        int num=0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt(); // 오버로딩된 상태
        
        if(num %2 == 0){
            answer ="Even";
        }
        else{
            answer="Odd";
        }
        System.out.println(answer);
    }
}*/

public class EvenOdd {

    public static void EvenString(int num) {
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        EvenString(num);
    }
}
