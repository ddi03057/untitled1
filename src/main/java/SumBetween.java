
public class SumBetween { // 두 수 사이의 합 계산
    public static void main(String[] args) {
        long sum=0;
        int a =8;
        int b =5;
        if(a<b){
            for (int i =a; i<=b; i++){
                sum +=i;
            }
        }else {
            for (int i =b; i<=a; i++){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
} // 이 코드는 a와 b의 값의 대소 관계에 따라 새로운 변수 i에 a나 b를 집어 넣어 sum 에다가 저장. i의 값이 다른 변수와 같아질 때 까지 반복