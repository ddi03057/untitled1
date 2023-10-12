public class MonthEnglish {
    public static void main(String[] args) {
        int month =1;
        switch (month){ //month : 변수
            case 1:
            System.out.println("January");
            break;
            case 2:
                System.out.println("February");
            case 5:
                System.out.println("MAy");
                break;
            default:
                System.out.println("일치하는 값 x");
        }
    }
}
