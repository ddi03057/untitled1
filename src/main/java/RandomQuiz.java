public class RandomQuiz {
    public static void main(String[] args) {
        //1~100 사이의 임의의 값을 얻어서 answer 에 저장
        int answer = (int) (Math.random()*100)+1; // 임의의 숫자를 넣을 때 항상 0부터 시작하는데 1~100의 숫자를 골라야 하므로 +1을 안하면 0~99시작
        int input = 0; // 사용자 입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수

        java.util.Scanner s= new java.util.Scanner(System.in); // 화면으로부터 사용자 입력을 받기 위함

        do{
            count++; // 숫자 맞출 때 까지 계속 입력되고 자동으로 카운트
            System.out.println("1과 100 사이의 값을 입력하세요.");
            input = s.nextInt();//입력받은 값을 변수 input 에 저장한다.

            if(answer>input){ //첫 번째 조건 성립 시 출력
                System.out.println("더 큰수를 입력하세요.");
            } else if (answer<input) { // answer>input 조건이 거짓이라 해당 조건이 성립,보통 조건 2개이상일 때 두번째 조건으로 else if 활용
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 "+count+"번입니다.");
                break;
            }
        } while (true); // 무한 반복, true 가 나올때까지
    }
}
