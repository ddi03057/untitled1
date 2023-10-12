public class LongStrange {
    public static void main(String[] args) {
        int num1 =50;
        System.out.printf("정수값 num1 : %d, %s\n", num1, Integer.toBinaryString(num1));

        int result1 = num1>>1;
        System.out.printf("num1 >> 1 : %d, %s\n", result1, Integer.toBinaryString(result1));

        int result2 = num1<<1;
        System.out.printf("num1 << 1 : %d, %s\n", result2, Integer.toBinaryString(result2));

        String str = "100";
        int i = Integer.parseInt(str);
        long l =Long.parseLong(str);
        System.out.println(i);

        String str2 =String.valueOf(i);
        System.out.println(i);
        System.out.println(str2);

        int pwd = 123456;
        int encPwd, decPwd;
        int key = 0x1A253B65;

        System.out.println("암호화 전 비밀번호 : "+pwd);
        encPwd = pwd^key; // XOR 연산, 2진수 변환
        System.out.println("암호화 후 비밀번호 : "+encPwd);
        decPwd = encPwd^key;
        System.out.println("복호화 후 비밀번호 : "+decPwd);
    }
}
