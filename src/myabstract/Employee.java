/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chris
 */
public abstract class Employee {
    private String name;
    
    //set and get methods for all classes
    public void setName(String name){
        this.name = name;
    }
     public String getName(){
         return name;
     }
     
     
     //abstract methods for classes
     abstract public void setPay(double pay);
     
     abstract public double getPay();
     
         
     
}
