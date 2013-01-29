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
    
    public void setName(String name){
        this.name = name;
    }
     public String getName(){
         return name;
     }
     
     abstract public void setPay(double pay);
     
     abstract public double getPay();
     
         
     
}
