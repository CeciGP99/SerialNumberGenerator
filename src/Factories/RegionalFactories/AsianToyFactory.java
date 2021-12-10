package Factories.RegionalFactories;

import Factories.ToyFactory;
import ToyProducts.Models.AsianCarToy;
import ToyProducts.Models.AsianHelicopterToy;
import ToyProducts.Toy;

public class AsianToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String type) {
        switch (type){
            case ("Car"): 
                return new AsianCarToy(serialNumberGenerator.next());
            case ("Helicopter"):
               return new AsianHelicopterToy(serialNumberGenerator.next());
            default: return null;
        }
    }
    
}
