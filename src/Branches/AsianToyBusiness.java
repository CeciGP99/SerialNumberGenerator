package Branches;

import Business.ToyBusiness;
import ToyProducts.Models.AsianCarToy;
import ToyProducts.Models.AsianHelicopterToy;
import ToyProducts.Toy;

public class AsianToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type) {
        switch (type){
            case ("Car"): 
                AsianCarToy carToy = new AsianCarToy(serialNumberGenerator.next());
                carToy.pack();
                carToy.label();
                return carToy;
            case ("Helicopter"):
                AsianHelicopterToy helicopterToy = new AsianHelicopterToy(serialNumberGenerator.next());
                helicopterToy.pack();
                helicopterToy.label();
                return helicopterToy;
            default: return null;
        }
    }
    
}
