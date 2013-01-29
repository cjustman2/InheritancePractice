/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author chris
 */
public interface Employee {
    /*abstract methods in interface*/
    public void setPay(double pay);
    public void setHours(int hours);
    public void setName(String name);
    public String getName();
    public double getGross();
}
