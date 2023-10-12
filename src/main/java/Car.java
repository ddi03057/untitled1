public class Car {
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        if(speed<0){
            this.speed=0;
            return;
        }else{
            this.speed = speed;
        }
    }
    private double speed;
    private boolean stop;

    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
