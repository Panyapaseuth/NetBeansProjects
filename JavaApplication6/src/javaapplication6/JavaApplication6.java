/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Advice
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input Money Dollar = ");
        
        double dollarInput = scanner.nextDouble();
        double exchangeRate = 9000;
        double result = dollarInput * exchangeRate;
        
        System.out.println(result+" kip");
    }
    
}
