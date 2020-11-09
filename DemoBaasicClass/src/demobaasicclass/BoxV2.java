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
public class BoxV2 {
    private double w, h, d; // access modifier
    //data + method
    
    //getter, setter
    
    public void setW(double w) {
        if( w > 0.0 ) {
            this.w = w;
        }
        else {
            throw new IllegalArgumentException("Value must more than Zero (0) ");
        }
    }
    
    public void setD(double d) {
        this.d = d;
    }
    
    public void setH(double h) {
        this.h = h;
    }
    
    public double volumn() {
        return w*h*d;
    }
    
    public double surfaceArea(){
        return (2.0*w*h) + (2.0*w*d) + (2.0*d*h);
    }
}
