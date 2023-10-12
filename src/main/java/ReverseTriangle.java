public class ReverseTriangle {
    public static void main(String[] args) {
        for (int a=1; a<=4; a++){ //a=1 -> b=1,2,3,4 출력하고 맨 윗줄 출력하면 1과 같거나 큰 수가 와야 함. (a<=b)1<=1,2,3,4
            for (int b=1; b<=4; b++){ // a=2 -> b=1,2,3,4 출력. 두 번째 줄은 2,3,4만 출력해야 역삼각형 모양이 잡히므로 2이상수만와야함((a<=b)2<=2,3,4)
                if(a<=b){
                    System.out.print("#"); // a보다 같거나 큰 수가 오면 #출력
                }else {
                    System.out.print(" "); // 공백으로 역삼각형 모양 잡음.
                }
            }
            System.out.println(); // 1차 for문 종료 : 각 행의 조건에 맞는 원소 출력
        }
        System.out.println(); // 2차 for문 종료 : 4열 출력
    }
}
 // 4열 4행의 #사각형에서 a가 더 큰 경우에 공백으로 날리는 형태, 이를 위해 이중 for 문으로 a의 범위