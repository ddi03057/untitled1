package 다형성;

public class Garen implements Champion {
    @Override
    public void call() {
        System.out.println("Garen Call");
    } // 새로운 클래스가 생성되면 해당 클래스를 추상 클래스로 만들거나 인터페이스에서 메서드 구현해야함. 메서드 구현 시 인터페이스 내에 존재하는 메서드는 오버라이딩 됨
}
