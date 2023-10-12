import com.sun.deploy.util.StringUtils;

public class Continue {
    public static void main(String[] args) {
        int oddnum = 0;
        oddnum=odd(oddnum);
        String o = Integer.toString(oddnum);
        o=o.substring(0,o.length()-2);
        System.out.print(o + " ");
        System.out.println();
        for(int i=0; i<10; i++){
            if(i==6){
                continue; // 지나간다는 의미로 해당 조건에서 반복문 시행x
            }
            System.out.println(i);
        }
    }
    public static int odd(int k){
        for (k=0; k<10; k++){
            if(k%2==0) {
                continue;
            }
            System.out.print(k + " ");
        }
        return k;
    }
}
