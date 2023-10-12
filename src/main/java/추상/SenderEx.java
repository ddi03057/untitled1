package 추상;

public class SenderEx { // 만일 ContentSender contentSender = new ContentSender() 생성 할 시 자식에서 오버라이딩 해주어야 인스턴스가
    // 생성이 되므로 예외가 발생함과 동시에 override 할 함수로 오버라이딩 처리
    public static void main(String[] args) {
        /*ContentSender contentSender = new ContentSender() {
            @Override
            public void sendMsg(String content) {
            }
        }*/
        ContentSender cs1 = new letterSender("SMS 문자","서수진","4달러"); // 필드의 다형성:cs1 객체가 3가지 타입지님
        cs1.sendMsg("슈화");

        System.out.println();

        letterSender ls = new letterSender("SMS 문자","김민니","3달러");
        ls.sendMsg("조미연"); //

        System.out.println();

        ContentSender cs2 = new KakaoSender("카톡","송우기","10달러");
        cs2.sendMsg("전소연");
    }
} // 각 추상 메서드들 호출하여 콘솔창에 실행
