package kata6;

import Toys.Car;
import Toys.Helicopter;
import Toys.SerialNumberGenerator;
import Toys.ToyBusiness;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ToyBusiness toyBusiness = new ToyBusiness();
        
        while(true){
            System.out.println("Introduce comando: ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            }else if(command.equals("Car")){
                toyBusiness.createCar();
            }else if(command.equals("Helicopter")){
                toyBusiness.createHelicopter();
            } else {
                System.out.println("Comando desconocido");
            }
        }
        
        System.out.println("Aplicación del cliente finalizado");
        
    }
    
}
