/*public class NamgoongSeong6 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=200; i++){
            if(i%2==0){
                sum-=i;
            }else{
                sum+=i;
            }
        }
        System.out.println(sum);
    }
} 오답 : 1+(-2)+3+(-4)의 계산 원리를 찾았으나 몇까지 더해야 100이상인지는 모름

public class NamgoongSeong6 {
    public static void main(String[] args) {
        int sum =0;
        int num =0;

        while (sum<100){
            ++num;
            if(num%2==0)sum-=num;
            else sum+=num;
        }
        System.out.println(num+"일 때, 총합이 "+sum+"이 된다.");
    }
}
public class NamgoongSeong6 {
    public static void main(String[] args) {
        int num = 0; // 정수들의 합 저장
        int count = 0;
        int i=0;

        while (num<100){
            count++; // i의 부호가 바뀔 때 마다 저장.
            i++; // 음수 판별 용

            if(i%2==0){
                num = num +(i*-1);
            } else {
                num=num+(i);
            }
        }
        System.out.println("카운트 횟수: "+count);
    }
}

public class NamgoongSeong6 {
    public static void main(String[] args) {
        int sum =0;
        int s=1;
        int num =0;

        for (int i=1; true; i++,s=-s){
            num=s*i;
            sum+=num;
            if(sum>=100){
                break;
            }
        }
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}
*/

/*public class NamgoongSeong6 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while (sum<100){
            ++num; // num++와 동일한 결과 도출
            if(num%2==0)
                sum-=num;
            else
                sum+=num;
        }
        System.out.println(num);
    }
}
 */
public class NamgoongSeong6 {
    public static void main(String[] args) {
        hundred();
    }

    private static void hundred() {
        int num = 0;
        int sum = 0;
        while (sum < 100) {
            num++;
            if (num % 2 == 0)
                sum -= num;
            else
                sum += num;

        }
        System.out.println(num);
        ;
    }
}
