import java.util.Arrays;

public class StringChar {
    public static void main(String[] args) {
        String str = "it is time to study";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr)); // 배열로 선언 했기 때문에 문자열 형변환 필수.
        instancesplit();
        String bArrprint = new String("i am a good boy"); // "word"메서드 로직 돌리기위해 외부에서 전역 변수 선언
        bArrprint = Arrays.toString(word(bArrprint));
        System.out.println(bArrprint);
        String nArrprint = new String();
        nArrprint=Arrays.toString(word2(nArrprint));
        System.out.println(nArrprint);
    }
    private static void instancesplit(){
        String a = "go to sleep";
        String[] aArr=a.split(" ");
        System.out.println(Arrays.toString(aArr));;
    }
    private static String[] word(String b){
        String[] bArr=b.split(" ");
        return bArr;
    }
    private static String[] word2(String nArrprint){
        String n= "on the way";
        String[] nArr=n.split(" ");
        return nArr;
    }
}
