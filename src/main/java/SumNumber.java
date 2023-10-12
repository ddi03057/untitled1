public class SumNumber {
    public static void twicesum(){ // 1~10까지 숫자 중 2의 배수 합
        int sum2=0;
        for (int i =1; i<10; i++){
            if(i%2==0){
                sum2+=i;
            }
        }
        System.out.println(sum2);

    }
    public static void main(String[] args) {
        int sum=0;
        for (int i =1; i<10; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        twicesum();
    }
}
