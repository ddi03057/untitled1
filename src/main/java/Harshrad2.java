public class Harshrad2 {
    public static void main(String[] args) {
        int n =18;
        String s =Integer.toString(n);
        int sum =0;

        for (int i=0; i<s.length();i++){
            sum +=((int)s.charAt(i)-48);
        }
        System.out.println(n%sum==0?true:false);
    }
}
// 문자열 변환후 for문 활용하여 숫자를 문자형으로 변환할 때 ascII 코드에 있는 숫자와 매칭시켜서 자릿수를 계산하는 방식