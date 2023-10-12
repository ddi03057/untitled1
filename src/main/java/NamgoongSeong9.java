import java.util.Scanner;

public class NamgoongSeong9 {
    private String name=null;

    public static void main(String[] args) {
        for (int x=0; x<=10; x++){
            for (int y=0; y<=10; y++){
                if(2*x+4*y==10){
                    System.out.println("x = " + x +" y = " + y);
                }
            }
        }
        String str = "12345";
        int sum =0;
        for(int i=0; i<str.length();i++){
            /*char number = str.charAt(i);
           sum+=number; 오답 */
            sum+=str.charAt(i)-'0'; // CharAt(i)는 문자열에서 i번째 문자 반환
            //문자 하나씩 일거서 숫자로 변환 후 sum에 더하면 되는데 문자코드로 할당된 것이라 문자'3'의 실제 코드는 51이다
            // 그렇기에 '0'을 빼야 문자코드로 48인 '0'을 변환하여 정상적인 계산으로 진행.
        }
        System.out.println("sum= "+sum);
        int num = 12345;
        int digitsum=0;

        while (num!=0){
            digitsum+=num%10;
            num/=10;
        }
        System.out.println("sum2 : " + digitsum);
        pivonarchi();
        pivonarchi2();
        int total = 0;
        total = pivonarchi3(total);
        String remove = Integer.toString(total);
        remove = remove.substring(0,str.length()-5);
        System.out.println(remove);
    }
    private static void pivonarchi(){
        int num1=1;
        int num2=1;
        int num3=0;
        System.out.print(num1+" , "+num2+" , ");
        for (int i=0;i<8;i++){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" , ");
        }
        System.out.println();
    }
    public static void pivonarchi2(){
        int n1=1;
        int n2=1;
        int n3=0;
        System.out.print(n1 + " , " + n2 + " , ");
        for (int i=0; i<10; i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" , ");
        }
        System.out.println();
    }
    private static int pivonarchi3(int k){
        int k1=1;
        int k2=1;
        int k3=0;

        System.out.print(k1 + " " + k2 + " ");
        for (int i=0; i<10; i++){
            k3=k1+k2;
            k1=k2;
            k2=k3;
            System.out.print(k3 + " ");
        }
        return k3;
    }
    public String getName(){
        this.name=name;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
