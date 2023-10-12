public class StringChangeNumber {
    public static void main(String[] args) {
        String s= "-24532";
        String s1="2344";
        String s2="33TU";
        int intValue1=Integer.parseInt(s);
        int intValue2=Integer.parseInt(s1);
        System.out.println(intValue1);
        System.out.println(intValue2);
        System.out.println(isNumeric(s));
        System.out.println(isNumeric(s1));
        System.out.println(isNumeric(s2));
        try { // 잘못된 문자형 예외 처리
            int intValue3=Integer.parseInt(s2);
            System.out.println(intValue3);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
    private static boolean isNumeric(String s){
        return s !=null&&s.matches("[0-9.]+"); // 전달 인자로 문자열을 받아 null인지 아닌지 체크 후 matches() 메서드를 활용하여
        // 특정 패턴을 설정하고 0~9까지 숫자들이나 소수점이 있는지 확인
    }
}
