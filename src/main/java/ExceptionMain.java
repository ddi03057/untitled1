public class ExceptionMain {
    public static void main(String[] args) {
        int num1 = 100;
        int num2=0;
        int result=0;

        if(num2 !=0){ // 두 연산자의 값이 달라야 result 값이 연산되어 출력되고, 그렇지 않으면 else 구문 출력
            result = num1 / num2;
        } else {
            System.out.println("0으로 나눌 수 없습니다");
        }
        System.out.println("result = " + result);
        System.out.println();

        try {
            result = num1/num2; //try - catch 내에서만 작동, 지금의 경우 0으로 나눠서 에러가 나지만 이를 싸잡아서 날림.
            System.out.println("result ="+result); // 예외가 발생했기 때문에 해당 코드 실행 x
        }catch (ArithmeticException ex){ //예외 포착한 경우 catch 가 실행. aritmethicException : 예외적인 산술 조건 터질 시 발생
            System.out.println("0으로 나누면 발생하는 Exception"); // aritmethicException의 경우 바로 catch구문으로 가서 코드 실행
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }


    } //finally : 마지막에 무조건 실행 시켜야 하며 예외 여부와 관련 없이 실행되는 코드, try 에서 할당 받은 공간 다시 반납 및 쓸데없는 메모리 처리
} //DataAcessException : sqlexception 의 일종 이자 가장 자주 쓰이는 데이터 접근에 관한 예외 처리\
// 왠만한 개발 환경에서는 에러 처리는 잘 없고 예외 처리가 많다.
