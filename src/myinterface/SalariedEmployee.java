/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author chris
 */
public class SalariedEmployee implements Employee{
      private double pay;
    private double gross;
    private String name;
    //methods used to set and get pay
    @Override
    public void setPay(double pay){
       this.pay = pay;
    }
    
    public double getPay(){
        return pay;
    }
    
    //method for hours even though it's not used becouse of interface
       @Override
    public void setHours(int hours){};
       
       //used to get gross pay per week
    @Override
    public double getGross(){
        gross = pay * 52;
        return gross;
    }
    
    //set and get name
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
