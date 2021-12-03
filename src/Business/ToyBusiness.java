package Business;

import ToyProducts.Toy;

public abstract class ToyBusiness {
    
    public SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
}
