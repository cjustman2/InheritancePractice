/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author chris
 */
public class HourlyEmployee extends Employee {
    private double pay;
    private int hours;
    private double gross;
    
    //set pay and hours
   public void setPay(double pay){
       this.pay = pay;
   }
   
   public void setHours(int hours){
       this.hours = hours;
   }
   
   //getting gross pay for hours worked
  public double getGross(){
      gross = pay * hours;
  return gross;
  }
    
}
