public class SimpleArrayPrint { // 배열 출력
    public static void main(String[] args) {
        SimpleArrayPrint a = new SimpleArrayPrint();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[%d,%d]", i, j);
            }
            System.out.println();
        }
        arraymin();
        int maxnum = 0;
        maxnum = arraymax(maxnum);
        System.out.println(maxnum);
        a.arraytotal();
    }
    public static void arraymin(){
        int[] arr = {3,2,1,6,1};
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        System.out.println(min);
    }
    private static int arraymax(int l){
        int[] arr={1,6,8,3,6};
        int max=arr[0];
        for (int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public void arraytotal(){
        int[][]num={{11,12,13},{21,22,23}};
        int total=0;

        System.out.println("num 배열 길이 : "+num.length);
        System.out.println("num[0] 배열 길이 : "+num[0].length);
        System.out.println("num[1] 배열 길이 : "+num[1].length);

        for (int i=0;i< num.length;i++){
            for (int j=0; j<num[i].length; j++){
                total+=num[i][j];
                System.out.println("num["+i+"]["+j+"]:"+num[i][j]);
            }
        }
        System.out.println("num 배열의 총합 : "+total);
    }
}
