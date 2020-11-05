/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Advice
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Food Type = ");
        String InputFoodType = scanner.nextLine();
        
        System.out.print("Flavor = ");
        String inputFlavor = scanner.nextLine();
        
        if(InputFoodType.equals("Thai"))
        {
            if(inputFlavor.equals("Spicy"))
            {
                System.out.println("Tom yum");
            }
            else if(inputFlavor.equals("Salty"))
            {
                System.out.println("Fried pork");
            }
            else
            {
                System.out.println("Pad thai");
            }
        }
        
        else if(InputFoodType.equals("American"))
        {
            if(inputFlavor.equals("Salty"))
            {
                System.out.println("French Fries");
            }
            else
            {
                System.out.println("Pizza");
            }
        }
    }
    
}
