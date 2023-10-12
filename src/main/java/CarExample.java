public class CarExample {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.setSpeed(-50);
        System.out.println("현재 : " + myCar.getSpeed());

        myCar.setSpeed(23);
        if (!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 : "+myCar.getSpeed());
    }
}
