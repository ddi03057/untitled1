import java.util.ArrayList;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        String[] name=new String[2];

        System.out.println(name[0]);
        //name[0]에서 길이를 구할려고 하면 null의 변수 참조에서 예외 발생
        // string 배열을 초기화 하지 않으면 값이 없다는 뜻의 null 출력
        ArrayList<Integer> scorelist = new ArrayList<>();
        scorelist.add(10);
        scorelist.add(20);
        scorelist.add(30);
        scorelist.add(40);
        scorelist.add(50);

        System.out.println(scorelist.size());
        System.out.println(scorelist.get(4));

        scorelist.add(2,300);

        System.out.println(scorelist);
    }
    public static void scarr(){
        int[] arrInt = {2,4,6,8};
        for (int i=0;i<arrInt.length;i++){
            System.out.println(arrInt[i]+" ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int []arrInt2=new int[6];
        for (int i=0;i<arrInt2.length; i++){
            System.out.print("정수 입력 : ");
            arrInt2[i]= sc.nextInt();
        }
        for (int i=0;i<arrInt2.length;i++){

        }
    }
}
