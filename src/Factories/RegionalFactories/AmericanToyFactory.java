package Factories.RegionalFactories;

import Factories.ToyFactory;
import ToyProducts.Models.AmericanCarToy;
import ToyProducts.Models.AmericanHelicopterToy;
import ToyProducts.Toy;

public class AmericanToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String type) {
        switch (type){
            case ("Car"): 
                return new AmericanCarToy(serialNumberGenerator.next());
            case ("Helicopter"):
                return new AmericanHelicopterToy(serialNumberGenerator.next());
            default: return null;
        }
       
    }
    
}
