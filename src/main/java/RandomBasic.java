/*public class RandomBasic {
    public static void main(String[] args) {
        String[] arr = new String[10];
        int[] index = new int[10];

        for (int i = 0; i<arr.length; i++){
            int a = (int)(Math.random()*10+1);
            index [i]=a;
            arr[i]="임의의 숫자:"+a;
        }
        for(String str :arr){
            System.out.println(str);
        }
        System.out.println();
    }
}*/

public class RandomBasic {//임의의 수를 중복되지 않도록 출력
    public static void main(String[] args) {
        String[] arr = new String[10];
        int[] index = new int[10];

        for (int i = 0; i < arr.length; i++) {

            boolean b = false; // for 문에다가 초기화 하는 이유는 2번째 for 문에서 j의 값과 a의 값이 일치한 시점에서 true 가 성립되어 continue 가 되고 두 번째 for문을 다시 한 번 돌고 continue가 되어야 하는데
            // 초기화가 for문 안에서 이루어지지 않으면 처음 일치한 값 상태로 1번째 for문으로 돌아가기 전에 무한 반복이 이루어지는 구성이라 for문 안에서 초기화 한 걸로 설정
            int a = (int) (Math.random() * 10 + 1);

            for (int j = 0; j < i; j++) {
                if (index[j] == a) {
                    b = true; //
                }
                System.out.println(a +" "+i);
            }
            if (b == true) {
                i--;
                continue;
            }
            index[i] = a;
            arr[i] = "중복되지 않는 임의의 수 : " + a;
        }
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
