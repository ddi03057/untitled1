public class Variable { //객체를 정의하는 틀
    public static void main(String[] args) {

        int a=-3;//Number -> integer ... -2, -1, 0, 1, 2 ...(정수)
        System.out.println(a);
        double b = 1.1;// 실수 double 형태로 저장
        String c = "das"; // 문자열 저장
        System.out.println(b);
        System.out.println(c);
        float d = 3.5f; // float 은 소수일 때 반드시 f 붙이기
        System.out.println(d);
        int e = (int) 1.1;//만일 int 형으로 소수 표현할려면 (int)이런식으로 형변환
        System.out.println(Integer.toString((int) 1.1));//
        String f = Integer.toString(8); //인자값이 원시 자료형이면 f가 리턴
        System.out.println(f.getClass()); //
        String s1= "Cat";
        String s2= "Cat";
        String s3 = new String("Cat"); //s1 == s2는 맞으나 s1 == s3 는 false -> 메소드가 생성자로 들어온 문자열을 출력하도록 오버라이딩
    }
}
