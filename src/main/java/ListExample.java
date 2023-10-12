import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String>testList = new ArrayList<>(); // 주로 List로 배열 형태의 객체 생성

        testList.add("1");
        testList.add("2");
        testList.add("3");

        for (int i=0; i<testList.size();i++){ // 크기를 구하고 그 크기만큼 반복해서 객체 하나하나 출력합니다.
            System.out.println("기본 for문:"+testList.get(i)); // 출력된 객체는 변경 불가
        }
        for (String a : testList){
            System.out.println("향상된, 개선된 for문:"+a);
        }
    }
}
