package 추상2;

public class ExamAbstract {
    /**
     * 추상 클래스 & 추상 메서드 abstract 사용하기 추상클래스는
     * 말 그대로 약간 추상적인 의미를 가진 클래스여야 하며
     * 비추상적인 클래스에서 이를 상속받아 사용.
     */
    public static void main(String[] ar) {
        Tiger tiger = new Tiger("Hodol");
        tiger.cry();
        tiger.behavior();
        System.out.println("사자의 이름은 :" + tiger.animal_name);

        Dog dog = new Dog("Mikey");
        dog.cry();
        dog.behavior();
        System.out.println("개의 이름은 :" + dog.animal_name);
    }
} // 괄호 닫는거 잊지말기. 메인 클래스와 메서드가 닫혀 있어야 추상 클래스든 인터페이스든, 하위 클래스 든 참조가 된다.
    abstract class Animal{ // 추상 클래스
        String animal_name;

        Animal(String name){
            animal_name=name;
        }
        public abstract void cry();
        public abstract void behavior();
    }
    class Tiger extends Animal{
        Tiger(String name) {
            super(name);
        } //추상클래스에서 사용할 생성자를 여기서 super 활용하여 생성

        @Override
        public void cry() {
            System.out.println("어흥");
        }

        @Override
        public void behavior() {
            System.out.println("우측으로 빠르게 움직인다.");
        }
    }
    class Dog extends Animal{

        public Dog(String name) { //public 접근 제어자가 제약이 없어서 해당 제어자가 있든 없든 하위 클래스 내 객체나 연산자 생성에 지장 없음
            super(name);
        }

        @Override
        public void cry() {
            System.out.println("멍멍");
        }

        @Override
        public void behavior() {
            System.out.println("왼쪽으로 느리게 달린다.");
        }
    }  // 인터페이스와 큰 차이점은 인터페이스는 메서드나 멤버 변수 만을 정의 하여 다른 클래스가 이를 강제적으로 사용하는 역할만 충실
// 그리고 여러 개의 인터페이스를 하나의 클래스에서 같이 사용하는 다중 상속이 가능하지만 abstract 는 클래스의 성격이 강해서 extends 로 상속하기 때문에 하나만 가능.

