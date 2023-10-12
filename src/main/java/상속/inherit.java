package 상속; //메인 메서드를 생성

public class inherit{
    public static void main(String[] args) {
        Phone p = new Phone();
        p.print(); // 변수 p를 출력할 메서드

        System.out.println();

        Phone p1 = new Iphone1("아이폰11");
        p1.print();

        System.out.println();

        Iphone1 p2 = new Iphone2("아이폰12");
        p2.print();
    }
}