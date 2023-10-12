import static jdk.nashorn.internal.objects.NativeString.length;

public class st {
    public static void main(String args[]) {

        System.out.println(6 * 6);
        System.out.println("1111".length());
        //(1111.length())->length()는 문자열의 길이 나타내며, 부호나 공백도 포함시킴

        String test = "test";// 문자열 변수 선언
        String str = new String("onr");
        System.out.println("length : " + length(test));
    }
}
