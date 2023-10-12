package binary;

public class binaryTest { // 여러 진수 표현법
    public static void main(String[] args) {
        int num = 10;
        int bNum=0B1010; //10을 2진수로 표현
        int oNum=012;//10을 8진수
        int hNum=0XA;//10의 16진수

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(hNum);
    }
}
