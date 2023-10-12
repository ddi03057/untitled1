/*public class SumBetween2 {
        public static void main(String[] args) {
            int a=10;
            int b=6;
            long sum =0;
            if(a>b){
                int i=a;
                a=b;
                b=i;
            }
            for (long i=a;i<=b;i++)
                sum +=i;
            System.out.println(sum);
        }
    }*/
// 이 코드는 a,b의 값이 어떻게 나오든지 간에 항상 a의 값이 b의 값과 일치 할 때 까지 for문을 돌려 sum에 합하여 저장하는 형태, 만약 a가 b보다 더 크다면
// if문을 통해 a와 b의 값을 서로 바꾸어 for문 실행(for문의 공식은 항상 b가 더 크다고 가정한 식이기 때문에 이를 어길 시 오류 발생)

public class SumBetween2{
    public static void main(String[] args) {
        long sum=0;
        int a=7;
        int b=5;
        for(int i=Math.min(a,b);i<=Math.max(a,b);i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
// 3번째 풀이 방식은 Math.min과max를 활용하여 두수의 대소 관계를 따지고 해당 값들을 min값과 max값이 동일할 때 까지 이를 반복