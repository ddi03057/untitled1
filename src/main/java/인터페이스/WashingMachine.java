package 인터페이스;

public interface WashingMachine {
    public void startButtonPressed();
    public void pauseButtonPressed();
    public void stopButtonPressed();
    public int changeSpeed(int speed);

    void dry();

    public interface dryCouse{
        public void dry();
    }
}

