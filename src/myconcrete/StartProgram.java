/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author chris
 */
public class StartProgram {
public static void main(String[] args) {
    /**
     * @param args the command line arguments
     */
HourlyEmployee hourlyemp = new HourlyEmployee();

hourlyemp.setName("Mike");

hourlyemp.setPay(12.00);
    System.out.println ("Name is " + hourlyemp.getName() + "Pay is " + 
            hourlyemp.getPay());
  
}
}