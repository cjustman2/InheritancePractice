/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chris
 */
public class StartProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee hourlyemp = new HourlyEmployee();
        
        hourlyemp.setName("Mike");

hourlyemp.setPay(12.00);
    System.out.println ("Name is " + hourlyemp.getName() + "Pay is " + 
            hourlyemp.getPay());
    }
}
