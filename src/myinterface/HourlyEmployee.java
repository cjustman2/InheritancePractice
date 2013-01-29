/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author chris
 */
public class HourlyEmployee implements Employee{
    private double pay;
    private int hours;
    private double gross;
    private String name;
    //set pay and hours for hourly employee
    @Override
    public void setPay(double pay){
       this.pay = pay;
    }
    @Override
    public void setHours(int hours){
        this.hours = hours;
    }
    
    //get gross pay for week
    @Override
    public double getGross(){
        gross = pay * hours;
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
