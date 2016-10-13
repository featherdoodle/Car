/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

import java.util.Scanner;

/**
 *
 * @author SyBye8898
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        
        System.out.println("1. default\n2. user choice\n3. the other one");
        
        choice = scanner.nextInt();
        
        Car car;
        
        if(choice == 1){
            car = new Car();
        }else if(choice == 2){
            car = userInputCar(1);
        }else{// if(choice == 3){
            car = userInputCar(2);
        }
        
        System.out.println(car);
        
    }
    
    
    public static Car userInputCar(int carType){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make: ");
        String make = scanner.nextLine();
        
        System.out.println("Model: ");
        String model = scanner.nextLine();
        
        System.out.println("Year: ");
        int year = scanner.nextInt();
        
        System.out.println("Price: ");
        int price = scanner.nextInt();
        
        if(carType == 1){
            System.out.println("Top Speed: ");
            int topSpeed = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Colour: ");
            String colour = scanner.nextLine();
            
            Car car = new Car(make, model, year, price, topSpeed, colour);
            return car;
        }else{// if(carType == 2){
            Car car = new Car(make, model, year, price);
            return car;
        }
        //return car;
    }
    
}
