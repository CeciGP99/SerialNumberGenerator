package Toys;

public class Car {
    
    private final Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.println("El coche con número de serie: " + serialNumber.toString() + " está empaquetado.\n");
    }
    
    public void label(){
        
    }
}
