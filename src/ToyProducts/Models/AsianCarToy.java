package ToyProducts.Models;

import Factories.SerialNumberGenerator;
import ToyProducts.Toy;

public class AsianCarToy implements Toy{
    
    private final Integer serialNumber;
    private final String type = "Car";

    public AsianCarToy() {
        this.serialNumber = SerialNumberGenerator.getInstance().next();
    }
    
    public void pack(){
        System.out.println("El " + type +  " con número de serie: " + serialNumber.toString() + " está empaquetado.\n");
    }
    
    public void label(){
        System.out.println("El " + type +  " con número de serie: " + serialNumber.toString() + " está etiquetado.\n");
    }
}
