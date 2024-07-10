
package helloworldapp;


public class HelloWorldApp {
    public static void main(String[] args){
        System.out.print("Hello world app !! \n");

        Bicycle bike = new Bicycle();
        bike.changeCadence(3);
        bike.printState();
       
    }
}


class Bicycle{
    int cadence=0;
    int speed=0;
    int gear=1;

    void changeCadence(int newValue){
        cadence = newValue;
    }

    
    void changeGear(int newValue){
        gear = newValue;
    }

    
    void sppedUp(int increment){
        speed = speed+  increment;
    }

    
    void applyBrakes(int decrement){
        speed =speed- decrement;
    }

    void printState(){
        System.out.print("Cadence: "+ cadence+ " Speed: "+ speed+ "Gear: "+ gear);
    }
}