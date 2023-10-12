package 인터페이스;

public class TestWashingMachine {
    public static void main(String[] args) {
        LGWashingMachine washingMachine = new LGWashingMachine(); //
        washingMachine.startButtonPressed();
        System.out.println("세탁기의 속도는\n"+washingMachine.changeSpeed(3));
    }
}
