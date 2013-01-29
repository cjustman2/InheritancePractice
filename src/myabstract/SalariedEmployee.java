/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chris
 */
public class SalariedEmployee extends Employee {
    private double pay;
    private double gross;
    
    //set pay wage for week
    @Override
    public void setPay(double pay){
        this.pay = pay;
    }
    
    //get pay for week
    @Override
    public double getPay(){
        return pay;
    }
    
    //getting gross pay for year
    public double getGross(){
        gross = pay * 52;
        return gross;
    }
    
  
    
}
