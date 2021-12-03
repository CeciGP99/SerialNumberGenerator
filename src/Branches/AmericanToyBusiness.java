package Branches;

import Business.ToyBusiness;
import ToyProducts.Models.AmericanCarToy;
import ToyProducts.Models.AmericanHelicopterToy;
import ToyProducts.Toy;

public class AmericanToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type) {
        switch (type){
            case ("Car"): 
                AmericanCarToy carToy = new AmericanCarToy(serialNumberGenerator.next());
                carToy.pack();
                carToy.label();
                return carToy;
            case ("Helicopter"):
                AmericanHelicopterToy helicopterToy = new AmericanHelicopterToy(serialNumberGenerator.next());
                helicopterToy.pack();
                helicopterToy.label();
                return helicopterToy;
            default: return null;
        }
       
    }
    
}
