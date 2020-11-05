/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Advice
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Money = ");
        int money = scanner.nextInt();
        
        if(money>20)
        {
            System.out.println("ชื้อเข้าหนม!");
        }
        else
        {
            System.out.println("ยอดกระปุก!");
        }
        
    }
    
}
