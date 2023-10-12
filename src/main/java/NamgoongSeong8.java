import java.util.Random;

public class NamgoongSeong8 {
    public static void main(String[] args) {
        for (int a=1; a<=6; a++){
            for (int b=1; b<=6; b++) {
                if ((a + b) == 6){
                    System.out.println(" " + a +" " + b);
                }
            }
        }
        int value=((int) (Math.random()*6)+1); //기본적으로 double타입 취급이라 정수로 표현할려면 무조건 형변환
        System.out.println("value:"+value);

        Random r = new Random();
        for(int i=1; i<=1; i++){
            System.out.println("nextInt():"+r.nextInt(10));
            System.out.println("nextBoolean():"+r.nextBoolean());
        }
        int dice1=r.nextInt(6)+1;
        int dice2=r.nextInt(6)+1;
        System.out.println("dice1="+dice1);
        System.out.println("dice2="+dice2);
        System.out.println("합계= "+(dice1+dice2));
        if(dice1+dice2==6){
            System.out.println("주사위 갯수 : "+dice1+" "+dice2);
        } else System.out.println("다시");

        Random j = new Random();
        System.out.println("주 사위 갯수");
        System.out.println();
        Randomdigit();
    }
    private static void Randomdigit() {
        int k;
        for (int j = 1; j <= 6; j++) {
            for (k = 1; k <= 6; k++) {
                if ((j + k) == 6) {
                    System.out.println(" " + j + " " + k);
                }
            }
        }
    }
}

