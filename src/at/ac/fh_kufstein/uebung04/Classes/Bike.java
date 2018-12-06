package at.ac.fh_kufstein.uebung04.Classes;

public class Bike extends Car {
    double maxspeed;

    public Bike(String color, int wheels, double speed, double maxspeed) {
        super(color, wheels, speed);
        this.maxspeed = maxspeed;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }
    @Override
    public void accelerate(double geschwindigkeit){
        if((this.speed+geschwindigkeit)>maxspeed){
            this.speed = maxspeed;
            System.out.println("höchstgeschwindigkeit erreicht");
        }

        else this.speed = this.speed + geschwindigkeit;
    }
    @Override
    public void slowdown(double geschwindigkeit){
        if((this.speed-geschwindigkeit)<0){
            this.speed = 0;
            System.out.println("Bike steht jetzt");
        }
        else this.speed = this.speed - geschwindigkeit;
    }
}
