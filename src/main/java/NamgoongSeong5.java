public class NamgoongSeong5 {
    public static void main(String[] args) {
       /* for(int i=0; i<20; i++){
            if(i>10){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            } : 오답(첫 번째 출력결과)
        }*/
        int x=12;
        char ch='3';
        int year = 400;
        boolean powerOn =false;
        int sum = 0;
        int minsum =0;
        int allsum = 0;
        String str="no";
        System.out.println(x>10&&x<20);
        System.out.println(ch!=' '&&ch!='\t'); //공백표현은 ' ', !(ch==' '|| ch=='\t'
        System.out.println(ch=='x'||ch=='X');
        System.out.println((int)ch>='0'&&ch<='9');
        System.out.println(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z'));
        System.out.println(year%400==0 || year%4==0 && year%100!=0);
        System.out.println(powerOn==false); // !powerOn
        System.out.println(str=="yes"); // str.equals("yes")
        for(int a=1; a<=20; a++){
            if((a%2!=0&&a%3!=0)){
                sum = sum + a;
            }
        }
        System.out.println(sum);
        /*for(int i=1; i<=10; i++){
            for(allsum=0; allsum<=10; allsum++){
                allsum+=i;
            } 오답
        }
        System.out.println(allsum);*/
        for(int i=1; i<=10; i++){
            minsum +=i;
            allsum +=minsum;
        }
        System.out.println(allsum);
        int k=0;
        int ksum=0;
        int ktotalsum=0;

        while (k<=10){
            ksum=ksum+k;
            ktotalsum=ktotalsum+ksum;
            k++;
        }
        System.out.println(ktotalsum);
        int jsum=0;
        for(int j=1; j<=10; j++){
            for (int l=0; l<=j; l++){
                jsum = jsum+l;
            }
        }
        System.out.println(jsum);
    }
}
