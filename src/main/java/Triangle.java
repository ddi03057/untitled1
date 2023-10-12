public class Triangle { // 직각 삼각형 출력
    public static void main(String[] args) {
        for (int a = 4; a >= 1; a--) { // 4에서 역순으로 1까지 숫자 반복해야 4열 생성 가능
            for (int b = 1; a >= b; b++) { // b의 값은 a의 한계에 따라 계속반복하여 a>b가 될 때 까지 # 출력
                System.out.print("#");
            }
            System.out.println(); // 줄바꿈 용도
        }
    }
}

