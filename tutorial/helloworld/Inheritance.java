

package inheritance;



public class Inheritance{
    public static void main(String[] args){
        ACBicycle acbike = new ACBicycle();
        acbike.printState();
    }
}

 interface Bicycle{
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}


class ACBicycle implements Bicycle{
    int cadence=0;
    int speed=0;
    int gear=1;
    
    public void changeCadence(int newValue){
        cadence = newValue;
    }

    
    public void changeGear(int newValue){
        gear = newValue;
    }

    
    public void speedUp(int increment){
        speed = speed+  increment;
    }

    
    public void applyBrakes(int decrement){
        speed =speed- decrement;
    }

    void printState(){
        System.out.print("Cadence: "+ cadence+ " Speed: "+ speed+ "Gear: "+ gear);
    }
}