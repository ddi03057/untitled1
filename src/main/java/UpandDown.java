public class UpandDown {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 14;

        int result1 = num1*num2;
        int result2 = num1%num2;

        System.out.printf("result1 : %d \n", result1); // printf ("출력 서식",출력할 내용);
        // 출력 서식 종류 : "%d"-정수형 출력, "%s"-문자형 출력, "%f"-실수형 출력, "%c"-문자열 출력, "%n"-줄바꿈, "%b"-boolean

        num1++;
        num2 *=2;
        System.out.printf("num1++ : %d \n", num1);
        System.out.printf("num2 *= 2 : %d \n", num2);

        System.out.printf("num1++ : %d \n", num1++);
        System.out.printf("--num1 : %d \n", --num1);
        System.out.printf("--num2 : %d \n", --num2);
    }
}
