/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author chris
 */
public class SalariedEmployee extends Employee{
        private double pay;
    private double gross;
    
    //set pay and get pay
   public void setPay(double pay){
       this.pay = pay;
   }
   
   public double getPay(){
       return pay;
   }
   
   //getting gross per week
  public double getGross(){
      gross = pay * 52;
  return gross;
  }
}
