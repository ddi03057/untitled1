public class BasicArrayIndex {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70; //score[2]와 동일
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k + 2] + score[4];
        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n", i, score[i]);
        }
        System.out.printf("tmp:%d%n", tmp);
        System.out.printf("score[%d]:%d%n", 7, score[7]); // 예외 발생

        try { for (int i=0; i<5; i++)
            System.out.printf("score[%d]:%d%n", 7, score[7]);
        } catch (ArithmeticException exception){
            System.out.println("배열에 존재하지 않음");
        }

    }
}
