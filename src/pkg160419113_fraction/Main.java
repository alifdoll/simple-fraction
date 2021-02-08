/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg160419113_fraction;

/**
 *
 * @author alif
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fraction fract1 = new Fraction(2,7);
        Fraction fract2 = new Fraction(3,8);
        
        Fraction fractMultiply = Fraction.Multiply(fract1, fract2);
        System.out.println("");
        System.out.println("1st Fraction : " + fract1.getEnumerator() + " / " + fract1.getDenominator());
        System.out.println("2nd Fraction : " + fract2.getEnumerator() + " / " + fract2.getDenominator());
        System.out.println("Multiplication Result : " + fractMultiply.getEnumerator() + " / " + fractMultiply.getDenominator());
    }
    
}
