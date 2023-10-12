public class Multiple {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("3의 배수");
        for (int i =1; i<=100; i++){
            if(i%3==0){ //나머지가 0
                System.out.println(i);
            }
        }
        for(int j=1; j<=100; j++){
            if(j%3==0){
                sum +=j;
            }
        }
        System.out.println("1~100까지 중 3의 배수 합 = " + sum);
    }
} // 순서 : i가 1인 최초 값부터 반복, 나머지가 0일 때마다 출력해서 콘솔창에 표시, j의 경우 sum에 저장되어 sum의 자동 덧셈 작업 후 출력
