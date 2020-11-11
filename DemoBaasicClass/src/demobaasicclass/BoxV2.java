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
    
    //constructor
    public BoxV2(double w, double h, double d){
//        this.w = w;
        setW(w);
        this.h = h;
        this.d = d;
    }
    
    public BoxV2(){
        
    }
    
    public void setW(double w) {
        if( w > 0.0 ) {
            this.w = w;
        }
        else {
            throw new IllegalArgumentException("Weight is must more than Zero");
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

    //getter
    public double getW() {
        return w;
    }

    @Override
    public String toString() {
//        return String.format("Weight = %.2f Height = %.2f Dept = %.2f", w,h,d);
        return String.format("Size = %.2f x %.2f x %.2f , Volume = %.2f", w,h,d , volumn());
    }
}
