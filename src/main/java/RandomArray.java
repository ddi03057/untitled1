import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int sum = 0;
        int num[][] = new int[3][3]; // 2차원 배열 선언

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = ++sum;
				System.out.printf("%2d ", num[i][j]);
            }
			System.out.println();
        } // 여기 까지 코드는 순차적으로 2차원 배열에 수 집어넣는 값 출력
        System.out.println();
        int arr[][] = {{1,2},{3,4},{5,6,7}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            int ran1 = random.nextInt(3);
            int ran2 = random.nextInt(3);
            int temp = num[0][0];
            num[0][0] = num[ran1][ran2];
            num[ran1][ran2] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
               System.out.printf("%2d ", num[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}