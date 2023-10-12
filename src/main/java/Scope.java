import com.sun.org.apache.xpath.internal.objects.XString;

public class Scope { // class Scope 영역, 외부에서는 class 내 변수 사용 불가,
    private String mText; // 클래스 안에서만 사용 가능
    static String sClassVal= "class value"; // 객체 생성하지 않고도 static 자원에 접근 가능
    public String mData; //

    public Scope(String text){
        mText =text;
    }
    public static final String name="chanjin";//final 역시 class 내에서 사용
    public static String printName(){
        System.out.println(name);
        return name;
    }
    public void method1(){ // 보통 지역 변수 사용(무분별한 접근으로 인한 중복 피하기 위해 메서드 내에서만 사용)
        String sMethodVal = "method1 Value";
        System.out.println(sClassVal);
    }
    @Override // 자식과 부모 클래스에서 같은 메서드 사용 가능
    public String toString(){
        return mText + mData;
    }
    public static void main(String[] args){ // 메인 메소드 내 변수가 static(정적)변수 아닐 시 클래스 변수를 객체화 필수
        System.out.println(sClassVal); // class 영역 내 오류 발생, 따라서 class 내에서 정적 변수로 static String sClassVal 선언
        //System.out.println(printName())or(name()); "printname"이 2번 나오는 이유 : return 한번 과 출력 화면 한 번 두번 동작된 것으로 추정
        System.out.println(name); // 저장된 값을 쌓아 놓는 형태로 전에 시행한 메서드가 빠져나오지 못하고 중복 실행.
        System.exit(0); // 2번 나오는 걸 방지 하기 위해 static block(클래스 변수 초기화), 강제 종료 메서드 exit 로 정상 종료
        // static block: 클래스가 로딩되고 클래스 변수가 준비되면 메모리가 생성되고 static 블록이 선언된 순서대로 실행하는데 이를 자동으로 실행하는 블록
        // 클래스

    }
}
