package at.ac.fh_kufstein.uebung_04;
import at.ac.fh_kufstein.uebung04.Classes.Car;
import at.ac.fh_kufstein.uebung04.Classes.Bike;

public class Aufruf {
    public static void main(String[] args){
        Car vw = new Car("rot", 4, 200);
        vw.setColor("rot");
        vw.setWheels(4);
        vw.setSpeed(200.0);
        vw.currentSpeed();

        Bike ktm = new Bike("blau",2,20,40);
        ktm.accelerate(100);
        ktm.slowdown(200);
        ktm.currentSpeed();
    }
}
