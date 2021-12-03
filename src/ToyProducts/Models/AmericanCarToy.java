package ToyProducts.Models;

import ToyProducts.Toy;

public class AmericanCarToy implements Toy{
    
    private final Integer serialNumber;
    private final String type = "Car";

    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.println("El  con número de serie: " + serialNumber.toString() + " está empaquetado.\n");
    }
    
    public void label(){
        System.out.println("El  con número de serie: " + serialNumber.toString() + " está etiquetado.\n");
    }
}
