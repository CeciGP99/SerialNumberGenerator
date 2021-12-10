package Business;

import Factories.ToyFactory;
import ToyProducts.Toy;

public class ToyBusiness {
    
    private ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        return toyFactory.produceToy(type);
    }
}
