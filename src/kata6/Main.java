package kata6;

import Toys.Car;
import Toys.SerialNumberGenerator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
        
        while(true){
            System.out.println("Introduce comando: ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            }else if(command.equals("Car")){
                Car car = new Car(serialNumberGenerator.next());
                car.pack();
                car.label();
            } else {
                System.out.println("Comando desconocido");
            }
        }
        
        System.out.println("Aplicación del cliente finalizado");
        
    }
    
}
