public class ElseIf {
    public static void main(String[] args) {
        int money=6500;

        if(money>=8000){
            System.out.println("순대");
        } else if(money >=5000){ //참가 거짓 판별만 가능
            System.out.println("스테이크");
        }
        else { // 조건이 거짓일 때 실행할 영역
            System.out.println("gg");
        }
    }
}
