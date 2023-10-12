package 상속; //package 생성 시 하위 클래스 내에 자동 생성

public class Phone { // 아이폰 12의 경우 Phone 과 아이폰 11의 기능을 포함시켜 출력 예정
    String name = "핸드폰";

    public void function(){
        System.out.printf("은 지문 인식 기능을 가지고 있다.");
    }

    public void print(){
        System.out.printf(name); //참조된 name 프린트
        function(); // 클래스의 function 메서드를 불러온다.
    }
}

class Iphone1 extends Phone{ // 부모클래스 Phone 을 상속 받아 자식 클래스 Iphone 이 부모 클래스 자원 사용, 여기서는 기능 설정 용
    public Iphone1(String name){
        this.name=name;// Phone class 로 보냄. this : 클래스 내의 멤버 변수와 지역 변수의 이름이 같을 경우 구분, 객체 클래스 제외한 모든 클래스
        //생성자의 첫줄에는 반드시 호출
    }

    @Override
    public void function(){
        if (this.name.equals("아이폰12"))
            super.function(); // 아이폰12 일때만 부모의 기능(지문인식기능), 즉 function 함수를 함께 출력하고 아니면 오버라이딩
        System.out.println("은 apple pay 기능을 갖고 있다.");
    }
}

class Iphone2 extends Iphone1{
    public Iphone2(String name){
        super(name); // Iphone class 로 보냄. super : 자신이 상속 받은 부모를 가리키는 참조 변수, 자식과 부모 구분용, 부모클래스에 기본 생성자 있는 경우
        // 오버로딩 된 생성자에 맞춰 인자 일치 시키기.
    }
    @Override
    public void function(){
        super.function(); //
        System.out.println("홍채인식 기능을 가지고 있다.\n");
    }
}

