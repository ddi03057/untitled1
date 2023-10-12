public class Sum {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int i=1; i<=10; i++){
            sum1 +=i;//계속 더하기, i가 조건에서
        }
        System.out.println("1부터 10까지의 합 = " + sum1);
    }
}
