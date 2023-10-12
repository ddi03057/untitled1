package binary;

public class NamgoongSeong {
    public static void main(String[] arv) {

        int x=2;
        int y=5;
        char c='A';
        char ch = '\uD55C';

        System.out.println(1 + x << 33); // <<비트이동은 덧셈보다 후순위이므로 3<33
        // int(32bit)는 33번 쉬프트가 아닌 1번만 쉬프트하고 3<<1은 3에 2의1제곱과 2를 곱한것과 동일
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);// 0 - x 계산 후 x++로 저장(현재x=3)
        System.out.println(x+=2);// (x=3으로 저장된 상태)
        System.out.println( !('A' <= c && c <='Z') ); // 대문자판별, ! (true 조건식) => false
        System.out.println('C'-c); // 'C'-'A' -> 67-65(문자코드로 계산)
        System.out.println('5'-'0');// '53-48'
        System.out.println(c+1); // 66
        System.out.println(c++);// B 저장(대입) 후 B 출력
        System.out.println(++c);// B 츨력 후 C 저장
        System.out.println(c); // 마지막으로 증감 연산된 시점 출력
        System.out.println(ch); // "한"의 유니코드
        System.out.println(x<<3); // 40
        System.out.println(x>>3); // 0
        System.out.println(y>>3); // 1
        System.out.println(y<<3); // 104
    }
}
