/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Advice
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        
        switch(userInput){
            case 1 :
                System.out.println("Hello World");
                break;
            case 2 :
                System.out.println("How are you ?");
                break;
            case 3 :
                System.out.println("Good bye");
                break;
            default :
                System.out.println("--");
        }
    }
    
}
