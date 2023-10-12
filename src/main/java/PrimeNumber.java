public class PrimeNumber { //100까지 소수 출력
    public static void main(String[] args) {
        for (int i =2; i<=100; i++){
            for (int j=2; j<=i; j++){
                if(i !=j && i%j==0) // 두 수가 다르거나 나머지가 나머지가 없는 경우 생략
                    break;
                    if(i==j){
                    System.out.println(i + " ");
                    }
            }
        }
    }
}

