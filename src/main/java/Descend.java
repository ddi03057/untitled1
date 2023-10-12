import java.util.Arrays;
import java.util.Collections;
/*public class Descend {
    public static void main(String[] args) {
        Integer[] array={35,23,33,11,22,76,83} ; //오름차순은 상관 없는데, 내림차순으로 정렬할려면 Integer로 선언해야함.
        Arrays.sort(array);
        for (int i =0; i< array.length;i++){
            System.out.print("["+array[i]+"]");
        }
        System.out.println();
        Arrays.sort(array, Collections.reverseOrder());// 내림차순으로 정렬, 만약 일부 인덱스만 정렬 시키고 싶으면 ',1,5',Coll... 식으로 정렬
        for(int i=0; i<array.length;i++){
            System.out.print("["+array[i]+"]");
        }
    }
}*/
public class Descend {
    public static void main(String[] args) {
        Integer[] array={35,23,33,11,22,76,83};
        descendprint(array);
        ascendingprint(array);
    }
    private static void descendprint(Integer[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println();
        System.out.println();
    }
    private static void ascendingprint(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
        for(int i=0; i<array.length;i++){
            System.out.print("["+array[i]+"]");
        }
    }
}
