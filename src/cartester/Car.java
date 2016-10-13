/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

import java.util.Random;

/**
 *
 * @author SyBye8898
 */
public class Car {
    
    String[] colourChoices = {"red", "blue", "green", "black", "purple"};
    String make, model, colour;
    int year, price, topSpeed;
    
    //default constructor
    public Car(){
        make = "make";
        model = "model";
        year = 7;
        price = 600;
        topSpeed = 4;
        colour = "blue";
    }
    
    public Car(String _make, String _model, int _year, int _price, int _topSpeed, String _colour){
        make = _make;
        model = _model;
        year = _year;
        price = _price;
        topSpeed = _topSpeed;
        
        colour = _colour;
        
    }
    //third constructor
    public Car(String _make, String _model, int _year, int _price){
        make = _make;
        model = _model;
        year = _year;
        price = _price;
        
        Random random = new Random();
        //top speed is randomly generated between 0 and 10000
        topSpeed = random.nextInt(10000);
        //colour is randomly selected
        colour = colourChoices[random.nextInt(4)]; //there are four colour choices
    }
    
    
    public void honkHorn(){
        System.out.println("honk");
    }
    
    @Override
    public String toString(){
        
        String output;
                
        output = "make: " + make + " model: " + model + " year: " + year + 
                " price: " + price + " top speed: " + topSpeed + " colour: " + colour;
        
        return output;
    }
    
    
}
