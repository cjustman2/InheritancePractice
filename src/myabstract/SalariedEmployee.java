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

    
    public void setPay(double pay){
        this.pay = pay;
    }
    
    public double getPay(){
        gross = pay * 52;
        return gross;
    }
    
  
    
}
