import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt ='0';

        System.out.println("점수를 입력해주세요.>");
        Scanner scanner = new Scanner(System.in);
        score= scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다. %n",score);

        if(score >=90){
            grade ='A';
            if (score >=98){
                opt = '+'; // 증감
            } else if (score<94) {
                opt='-';
            }
        } else if (score>=80) {
            grade = 'B';
            if (score >=88){
                opt = '-';
            }
        }else{
            grade ='c';
        }
        System.out.printf("당신의 학점은 %c%c 입니다.%n",grade,opt);
    }
}
