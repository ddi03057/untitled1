/*public class DoubleFor {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++){
            for (int j=1; j<=9; j++){
                if(i==3)
                    break; // 3단 제외
                //System.out.println(i+" * " +j+ " = "+i*j);
                System.out.printf("%d * %d = %d%n",i,j,i*j); // printf 로 출력 시 줄 바꿈 키는 %n
            }
        }
    }
}*/

public class DoubleFor {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            System.out.println(i+"단");
            for (int j=1; j<=9; j++){
                System.out.printf("%d * %d = %d%n",i,j,i*j);
            }
        } // 1단부터 9단까지 출력
    }
}
