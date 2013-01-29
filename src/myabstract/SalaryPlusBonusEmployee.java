/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chris
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonus;

    //getting bonus for salaried employee 10% of weekly pay
    public double getBonus(){
        bonus = getPay() * .1;
        return bonus;
    }
}
