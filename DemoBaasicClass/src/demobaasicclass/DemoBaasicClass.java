/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobaasicclass;

/**
 *
 * @author Advice
 */
public class DemoBaasicClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        BoxV1 aBox = new BoxV1();
//        aBox.d = 10.0;
//        aBox.w = 5.0;
//        aBox.h = 7.0;
        
          BoxV1 aBox = new BoxV1();
          BoxV2 aBox2 = new BoxV2();
          aBox2.setD(-10.0);
          aBox2.setW(-5.0);
          aBox2.setH(7.0);
          
        System.out.println(aBox2.volumn());
        System.out.println(aBox2.surfaceArea());
    }
    
}
