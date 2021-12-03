package kata6;

import Branches.AmericanToyBusiness;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        AmericanToyBusiness toyBusiness = new AmericanToyBusiness();
        
        while(true){
            System.out.println("Introduce comando: ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            }else if(command.equals("Car")){
                toyBusiness.createToy(command);
            }else if(command.equals("Helicopter")){
                toyBusiness.createToy(command);
            } else {
                System.out.println("Comando desconocido");
            }
        }
        
        System.out.println("Aplicación del cliente finalizado");
        
    }
    
}
