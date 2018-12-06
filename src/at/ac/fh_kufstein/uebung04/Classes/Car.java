package at.ac.fh_kufstein.uebung04.Classes;

public class Car {
    String color;
    int wheels;
    double speed;

    public Car(){}
    public Car(String color, int wheels, double speed) {
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }

    public void currentSpeed(){
        System.out.println(this.speed);
    }
    public void setSpeed(double a){
        this.speed = a;
    }
    public void setWheels(int a){
        this.wheels = a;
    }
    public void setColor(String a){
        this.color = a;
    }
    public void accelerate(double Geschwindigkeit){
        this.speed = this.speed + Geschwindigkeit;
    }
    public void slowdown(double Geschwindigkeit){
        this.speed = this.speed - Geschwindigkeit;
    }
    public double getSpeed() {
        return speed;
    }
    public int getWheels() {
        return wheels;
    }
    public String getColor() {
        return color;
    }
}
