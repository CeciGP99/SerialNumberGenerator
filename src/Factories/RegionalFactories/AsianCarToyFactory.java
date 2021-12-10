package Factories.RegionalFactories;

import Factories.ToyFactory;
import ToyProducts.Models.AsianCarToy;
import ToyProducts.Models.AsianHelicopterToy;
import ToyProducts.Toy;

public class AsianCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianCarToy(serialNumber);
    }
}
