/*public class NamgoongSeong4 {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        int c = a + b;
        //byte c = (byte)(a+b);
        char ch = 'A';
        ch = (char) (ch + 2);
        double f = (float)3 / 2;
        // float f = 3/2f;
        long l = (long) ((double)3000 * 3000 * 3000);
        //long l =3000*3000*3000L; : long타입 접미사 L을 붙여야 long타입 값 출력
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = (float)d == f2;
        System.out.println("c=" + c);
        System.out.println("ch=" + ch);
        System.out.println("f=" + f);
        System.out.println("l=" + l);
        System.out.println("result=" + result);
    }
}
public class NamgoongSeong4 {
    public static void main(String[] args) {
        char ch ='d';
        boolean b = ('a'<=ch &&ch<='z')||('A'<=ch&&ch<='Z'||('0'<=ch&&ch<='9'));
        System.out.println(b);
    }
}
*/

public class NamgoongSeong4 {
    public static void main(String[] args) {
        char ch ='L';
       // char lowerCase = ((int)ch<97) ? ((int)ch-32):ch; : 오답
        char lowerCase =('A'<=ch&&ch<='Z')?(char)(ch+32):ch;
        // ASCII 코드의 대문자의 경우 문자코드 값 +32하면 소문자가 된다. 덧셈 연산의 결과가 int 형으로 튀어나오므로 (char)형변환
        System.out.println("ch: "+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}