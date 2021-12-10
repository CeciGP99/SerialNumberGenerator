package kata6;

import Business.ToyBusiness;
import Factories.RegionalFactories.AsianToyFactory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        AsianToyFactory toyFactory = new AsianToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness(toyFactory);
        
        while(true){
            System.out.println("Introduce comando: ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            }else if(command.equals("Car")){
                toyBusiness.produceToy(command);
            }else if(command.equals("Helicopter")){
                toyBusiness.produceToy(command);
            } else {
                System.out.println("Comando desconocido");
            }
        }
        
        System.out.println("Aplicación del cliente finalizado");
        
    }
    
}
