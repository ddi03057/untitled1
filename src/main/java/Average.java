import java.util.Scanner;

public class Average { // 5개의 정수를 입력 받아 평균 내는 함수
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum=0;

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<=arr.length-1;i++){ // 배열은 0부터 n-1까지인데 int[5]로 했으면 index 의 값은 0~4이다. 그런데 조건은 5번째 인덱스에 접근시 array 배열 예외가 발생하므로 조건에서 배열의 길이에 -1붙여야 해결
            arr[i]= scanner.nextInt();
            sum +=arr[i];
        }
        System.out.println((double)sum/(arr.length)); // 평균 배열 값
    }
}
