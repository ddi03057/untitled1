import java.util.Scanner;

/*public class MathSqrt2 {
    public static void main(String[] args) {
        long n;
        Scanner scanner = new Scanner(System.in);
        n=(long) scanner.nextLong();
        double x=Math.sqrt(n);

        System.out.println((x%1==0)?(long)Math.pow(x+1,2):-1);//삼항 연산자를 출력문에 대입.?는 if 의 역할 수행(조건?참일때:거짓 일 때)
    }
}
*/

public class MathSqrt2 {
    public static void main(String[] args) {
        long n;
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextLong();
        if(Math.pow((int)Math.sqrt(n),2) == n){
            System.out.println((long)Math.pow(Math.sqrt(n)+1,2));
        } else
        System.out.println("-1");
    }
}