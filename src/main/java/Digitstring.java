import java.util.Scanner;

/*public class Digitstring {
    public static void main(String[] args) {
        int answer = 0;
        int n=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        String[] array = String.valueOf(n).split(""); // 문자열 1차원 배열 array 선언 후, ()의 정수형 객체 'n'을 문자로 형변환, spilt("")은 공백을 기준으로 문자를 나눔
        for (String s :array){ // = for(int s=0; s<array.length; s++) -> 변수 i를 for문으로 반복하면서 값을 일일이 저장하지만 배열을 단순화시키고자 배열을 for문의 조건으로 둠.
            answer += Integer.parseInt(s); // 문자열 s를 배열로 선언한 값을 answer에 집어넣으면서
        }// String으로 변환 시킨 문자들을 숫자로 변환시키면서 자리수의 합으로 도출, 만약 parselnt 명령어가 없다면 자리수 합을 이끄는 공식이 발동 x.
        System.out.println(answer);
    }

}*/

public class Digitstring {
    public static void main(String[] args) {
        Digitstring d = new Digitstring(); //
        System.out.println(d.digit());
    }

    private static int digit(){

        int a=0;
        String[] array = String.valueOf(a).split("");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();

        for (String s : array){
            a+=Integer.parseInt(s);
        }
        return a;
    }
}