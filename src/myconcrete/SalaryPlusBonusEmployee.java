/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author chris
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonus;
    
    public double getBonus(){ 
         bonus = getPay() * .1;
         return bonus;
    }
}
