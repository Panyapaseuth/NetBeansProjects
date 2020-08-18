/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vatcalculator;

/**
 *
 * @author Advice
 */
public class Vatcalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 600;
        int vat = 10;
        int total = x+(x*vat)/100;
        System.out.println(total);
    }
    
}
