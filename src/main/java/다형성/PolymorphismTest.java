package 다형성;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PolymorphismTest {
    public static void main(String[] args) {
        Human h = new Cheolsu();
        h.call(); // h 객체에 저장된 cheolsu호출
        //Cheolsu c = new Human();-> 항상 큰 범위의 객체에 작은 객체 집어 넣기.
        //h.status();//human에 존재하지 않으니 못씀
        Champion c = new Garen();
        c.call();
        Map<String, String> m = new HashMap<String, String>();
        Map<String, String> m2 = new LinkedHashMap<String, String>();
    // Map<String, String> = new HashMap<>();-> Map이 인터페이스라 선언만되서 자식인 hashMap으로 객체 생성
    }// HashMap은 부모인 Map메소드들을 강제 상속받음. 비슷하게 List역시 ArratList로 객체생성해야 쓸수 있음.
    //
}
