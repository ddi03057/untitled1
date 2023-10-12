public class NamgoongSeong7 {
    public static void main(String[] args) {
        star();
        System.out.println();
        for(int i=0; i<=10;i++){ //10열 까지 반복
            for(int j=0; j<=i;j++)
                System.out.print("*"); // 행에 i,j값이 같을 떄 까지 별 출력
            System.out.println();
        }
        System.out.println();
        int i=0; // 인덱스가 1이기 때문에 만일 1로 초기화 하면 '2'번째 값부터 시작
        while((i++)!=10) {
            int j = i;
            while ((j--) != 0) {
                System.out.print("*");
            }
            System.out.println();
        }
        int a=1;
        int line=10;
        while (a<=line){
            int b=line;
            while (a<=b){
                System.out.print("*");
                b--; // 별찍으면 1개씩 감소 -> 1줄 채울 때 까지 반복
            }
            System.out.println();
            a++;//10열에 도달할 때 까지 증가
        }
        System.out.println();
    }
    private static void star(){
        int l=1;
        int r=10;
        while (l<=r){ // 10열 다 채워지면 종료
            int p=r;
            while (l<=p){
                System.out.print("*");
                p--; // 별찍으면 1개씩 감소 -> 1줄 채울 때 까지 반복
            }
            System.out.println();
            l++;//10열에 도달할 때 까지 증가
        }
    }
}



