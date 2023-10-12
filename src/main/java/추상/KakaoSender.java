package 추상;

public class KakaoSender extends ContentSender {
    String content;

    public KakaoSender(String title, String nm, String content) {
        super(title, nm);
        this.content = content;
    }

    @Override
    public void sendMsg(String recipient) {
        System.out.println("제목="+this.title); //항상 추상클래스 내 변수 생성 해야 다른 하위나 기타 클래스 내에서 참조하여 사용 가능
        System.out.println("이름="+this.nm);
        System.out.println("내용="+this.content);
        System.out.println("받는 사람="+recipient);
    }
}
