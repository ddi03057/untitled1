package 리플렉션; // 이미 로딩이 된 클래스에서 또 다른 클래스를 동적으로 로딩하여 생성자, 멤버 필드, 멤버 메서드 등을 사용할 수 있는 기법
// 특정 애노테이션이 붙어 있는 필드 또는 메소드를 읽거나 특정 이름 패턴에 해당하는 메서드 목록 가져와 호출.
import java.lang.reflect.Method;

public class Reflection1 {
    public void reflectionTest() {
        try {
            Class vectorClass = Class.forName("java.util.Vector"); // 클래스의 이름으로부터 인스턴스 생성 및 클래스 정보 갖고옴
            // Class.forName("클래스명")으로 가져오는 방법
            Method[] methods = vectorClass.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println(method.toString());
            }

        } catch (ClassNotFoundException e) {
            // Exception Handling
        }
    }

    public static void main(String[] args) {
        new Reflection1().reflectionTest();
    }
}
