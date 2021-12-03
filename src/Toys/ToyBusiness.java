package Toys;

import ToyProducts.Models.HelicopterToy;
import ToyProducts.Models.CarToy;
import ToyProducts.Toy;

public class ToyBusiness {
    
    SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    public Toy createToy(String type){
        
        switch (type){
            case ("Car"): 
                CarToy carToy = new CarToy(serialNumberGenerator.next());
                carToy.pack();
                carToy.label();
                return carToy;
            case ("Helicopter"):
                HelicopterToy helicopterToy = new HelicopterToy(serialNumberGenerator.next());
                helicopterToy.pack();
                helicopterToy.label();
                return helicopterToy;
            default: return null;
        }
        
    }
}
