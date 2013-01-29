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
    private int hours;
    private double gross;
    private String name;
    
    @Override
    public void setPay(double pay){
       this.pay = pay;
    }
       @Override
    public void setHours(int hours){};
       
    @Override
    public void setGross(double gross){
        this.gross = gross;
    }
    @Override
    public double getGross(){
        gross = pay * 52;
        return gross;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
