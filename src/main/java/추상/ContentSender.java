package 추상;

public abstract class ContentSender { // 반드시 추상메서드 1개 이상 필요
    String nm;
    String title;

    public ContentSender(){

    }

    public ContentSender(String title, String nm){
        super();
        this.title=title;
        this.nm=nm;
    }
    public abstract void sendMsg(String content); // 추상 메서드 -> 추상 클래스가 인스턴스 생성이 안되므로 상속을 이용하여 추상 메서드를 통해
    // 인스턴스 생성 , 자식 클래스에서 반드시 구현되야 하므로 private 접근 제어자 사용 불가.
}

