
public class NamgoongSeong2 { // 문자열 있으면 false
    public static void main(String[] args) {
        distinguish();
    }
    public static void distinguish(){
        String value = "23144";
        char ch=' ';
        boolean isNumber =true;

        for(int i=0; i<value.length(); i++){
            if(!Character.isDigit(value.charAt(i))){
                isNumber=false;
            }
        }
        System.out.println(isNumber);
    }
}