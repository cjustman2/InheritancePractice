/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chris
 */
public class HourlyEmployee extends Employee {
   private double pay;
   private int hours;
   private double gross;
   
   public void setPay(double pay){
       this.pay = pay;
   }
   
   public void setHours(int hours){
       this.hours = hours;
   }
   
   public double getPay(){
       return gross;
   }
    
}
