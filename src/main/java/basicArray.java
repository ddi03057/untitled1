public class basicArray {
    public static void main(String[] args) {
        int grade1[] = new int[2];//1차원의 2칸짜리 배열
        int grade2[] = new int[3];
        int[][] larr={{5,5,5,5,5},{10,10,10},{20,20,20,20},{30,30}};
        System.out.println(larr[3].length);

        grade1[0]=85;
        grade1[1]=90; //인덱스로 배열 초기화
        grade2[0]=65; // 배열 길이보다 적은수의 배열 요소만 초기화
        //int[] grade = new int[]{1,2,3,4,5}; // 배열의 선언 및 초기화
        //int some = grade.length;
        //System.out.println(grade[grade.length-1); 마지막 배열의 인덱스를 출력하고 싶으면 반드시 길이에서 -1

        for (int i = 0; i < grade1.length; i++) {
            System.out.println(grade1[i] + " ");
        }
        for (int i = 0; i < grade2.length; i++) {
            System.out.println(grade2[i] + " ");
        }
    }
} /* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException 예외 : 배열의 크기를 n이라고 할 때 배열의 인덱스는 1부터
n까지가 아닌 0부터 n-1까지, 즉 배열의 크기보다 크거나 음수 인덱스 상황이 발생했을 떄 오류
지금의 경우 배열의 크기는 2인데 3번째 인덱스에 접근시도했으므로 오류 발생 -> 따라서 grade1의 3번째 인덱스를 지우니 오류 해결*/

