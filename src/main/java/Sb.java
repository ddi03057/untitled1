import java.io.IOException;

public class Sb {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder("aaa"); // string은 변수가 저장되면 값을 못바꾸나, buffer나 builder는 변할수 있음
        // 둘다 new 선언자로 객체 생성, 빌더는 버퍼와 달리 싱글쓰레드
        System.out.println(sb.append("bbb")); // aaabbb : bbb 문자열을 마지막에 더하기,
        System.out.println(sb.append(4)); // aaabbb4 :
        System.out.println(sb.insert(2, "ccc")); // aacccabbb4
        System.out.println(sb.replace(3, 6, "ye")); // aacyebbb4
        System.out.println(sb.substring(5)); // bbb4
        System.out.println(sb.substring(3, 7)); // yebb
        System.out.println(sb.delete(3, sb.length())); // aac -> 항상 마지막으로 출력된 값에서 함수 적용
        System.out.println(sb.toString()); //aac
        System.out.println(sb.reverse()); //caa
        sb.setCharAt(1, 'b');
        System.out.println(sb); //cba
        sb.setLength(2);
        System.out.println(sb); //cb
    }//
}
