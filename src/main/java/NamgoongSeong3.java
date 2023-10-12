import java.util.Scanner;

/* public class NamgoongSeong3 {
        public static void main(String[] args) {
            int num =0;
            System.out.println(num>0 ? "양수":num<0?"음수":"0");
        }
    }
 public class NamgoongSeong3 {
    public static void main(String[] args) {
        int num= 0;
        if(num>0){
            System.out.println("양수");
        } else if (num<0) { //
            System.out.println("음수"); // num>0 불만족 시 실행
        }
        else {
            System.out.println("0");
        }
    }
}


public class NamgoongSeong3 {
    public static void main(String[] args) {
        int num =649;
        System.out.println((num/10)*10+1); // 10의 자리까지 나누고 일의자리를 0으로 만든 다음+1
    }
} 

public class NamgoongSeong3 {
    public static void main(String[] args) {
        int num = 1707;
        System.out.println(10-num%10);// 나머지는 무조건 num보다 한 자리 낮을 거니깐 10에서 숫자를 10으로 나눈 나머지 빼기
    }
}
public class NamgoongSeong3{
    public static void main(String[] args) {
        int fahrenheit = 221;
        float celcius = ((int)((5/9f*(fahrenheit-32))*100+0.5)/100f);
        // 5/9의 int 연산은 0이므로 float형태로 바꿔야 소수 계산이 가능.
        System.out.println("Fahrenheit: "+fahrenheit);
        System.out.println("Celcius: " + celcius);
    }
}*/
public class NamgoongSeong3 {
    public static double fahrenheit(double f){
        return(f-32)*1.8;
    }
    public static double celtofah(double f){
        return 1.8*f+32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 섭씨 -> 화씨");
        System.out.println("2. 화씨 -> 섭씨");
        System.out.print("선택 : ");
        int val = sc.nextInt();
        double num;

        switch (val){
            case 1:
                System.out.print("섭씨 입력 : ");
                num=sc.nextDouble();
                System.out.println("변환된 화씨: "+fahrenheit(num));
                break;
            case 2:
                System.out.print("화씨 입력 : ");
                num=sc.nextDouble();
                System.out.println("변환된 섭씨: "+celtofah(num));
                break;
            default:
                System.out.println("오류");
        }
    }
}