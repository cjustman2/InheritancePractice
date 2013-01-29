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
   public void setPay(double pay){
       this.pay = pay;
   }
   
  public double getPay(){
  return pay;
  }
    
}
