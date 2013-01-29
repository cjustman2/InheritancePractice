/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author chris
 */
public class SalaryPlusBonusEmloyee extends SalariedEmployee {
 
    private double bonus;

    
    public double getBonus(){
        bonus = getPay() * .1;
        return bonus;
    }
    
}
