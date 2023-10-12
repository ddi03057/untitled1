import java.util.Arrays;

public class DataType {
    public static void main(String[] args) {
        double num = 0.1; //double 실수형
        double num3 = 7.0f + 3.14;
        for (int i = 0; i < 1000; i++) {
            num += 0.1;
        }

        long l =30l; // 제일 긴 정수 타입
        short s =30;
        boolean isMarried = true;
        isMarried = false;
        double dd = 30.0;
        float ff= 30.0f;
        dd =ff; //큰 더블 형에 작은 float 형들어가서 자동으로 형변환
        ff = (float) dd;//double을 작은 타입에다가 넣어야 해서 자동 형변환안됨
        String str = "여러 글자";
        int i = (int)30L; // 강제로 작은 타입으로 타입캐스팅 or 형변환
        System.out.println(num);
        System.out.println(num3); /*float 과 double 데이터의 산술 연산,
        float 데이터가 double로 자동치환 */
        System.out.println(num3 / num); // /연산자의 몫 값 도출
        System.out.println(num3 % num); // %연산자는 나머지 값 도출
        System.out.printf("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.","홍길동",20,180.5f); //앞에 포맷을 주고 뒤에 인자 주입
        System.out.println("");
        System.out.println(l);
        System.out.println(s);
        String str2 = String.format("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.","홍길동",20,180.5f); // sout 구문과 양식은 다르나 값은 동일.
        System.out.println(str2);
    }
}
