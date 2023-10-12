/*public class Average2 { // 배열 평균
    public static void main(String[] args) {
        long sum = 0;
        int[] array = {1,2,5,7,10};
        for (int i =0; i<array.length; i++){
            sum+=array[i];
        }
        System.out.println(Math.round(sum/(double)array.length)); // 소수점 출력을 위해 강제로 출력값에 double 형변환
    } // 소수점 출력안할꺼면 Math.ceil(올림), floor(버림), round(반올림)
} */

public class Average2 {
    public static void main(String[] args) {
        long sum=0;
        int[] array={1,2,5,7,10};
        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }
        System.out.println(sum/(long)array.length);
    }
}