public class GetterSetter {
    private static Object age;

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("홍길동",10);

        System.out.println(person); // 알기 쉬운 문자로 바꿀려면 toString 메서드 생성
        System.out.println(person2);
    }
} // command + i  자동으로 맞추기

class Person{
    private String name;

    public int getAge() {
        return age;
    }

    private int age; // 일반 클래스에서 속성과 기능을 정의하는 거라 외부 접근을 최대한 제한해야 코드짜는데 수월
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Person(){ // 클래스명과 똑같은 생성, 리턴값 x, 이 생성자는 매개변수x
     }

    Person(String name, int age){ // 필드를 전달받아 오버로딩된 생성자, 그렇기에 매개변수 존재
        this.name=name; // this = 자기 자신, private 접근 지정자에서 선언한 변수 참조
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() { // 역시 command+i 눌러서 toString 생성하면 자신이 선언한 필드를 포함하여 생성
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
} // command + n : 생성 : 생성자, Getter/setter, toString 등