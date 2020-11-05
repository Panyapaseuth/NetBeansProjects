/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Advice
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        if(money >= 200)
        {
            System.out.println("Krapao + Cola + Snack");
        }
        else if(money >= 100)
        {
            System.out.println("Krapao + Cola");
        }
        else if(money >= 50)
        {
            System.out.println("Krapao");
        }
        else
        {
            System.out.println("-");
        }
    }
    
}
