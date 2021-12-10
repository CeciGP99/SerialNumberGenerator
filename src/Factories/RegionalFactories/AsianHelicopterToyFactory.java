package Factories.RegionalFactories;

import Factories.ToyFactory;
import ToyProducts.Models.AsianCarToy;
import ToyProducts.Models.AsianHelicopterToy;
import ToyProducts.Toy;

public class AsianHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianHelicopterToy(serialNumber);
    }
    
}
