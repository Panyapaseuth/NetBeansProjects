/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Advice
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String password = "1234";
        String inputPassword;
        
        do
        {
            System.out.print("Password = ");
            Scanner scanner = new Scanner (System.in);
            inputPassword = scanner.nextLine();
        }
        while(!password.equals(inputPassword));
        System.out.println("Hello World !");
    }
    
}
