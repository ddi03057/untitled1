public class OneTo100Sum {
    private static int HundredSum(){
        int total=0;
        for (int k=1; k<=100; k++){
            total+=k;
        }
        return total;
    }
    public static void main(String[] args) {
        int i =1;//변수 선언
        int sum=0;//리턴 받아야 할 합계 변수 선언
        int num1 =5, num2=7, result;

        result=(num1-num2>0)?num1:num2; // 변수는 선언 후 재정의 가능
        System.out.println("두 정수 중 더 큰 수" + result + "입니다");

        for(i=1; i<=100; i++){ //i가 100들어갈 때 까지 반복
            sum +=i;
        }
        System.out.println(sum);
        OneTo100Sum r = new OneTo100Sum();
        System.out.println(HundredSum());
    }
}
