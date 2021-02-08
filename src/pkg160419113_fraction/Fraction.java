/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg160419113_fraction;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;
import sun.rmi.runtime.Log;

/**
 *
 * @author alif
 */
public class Fraction {
    
    private double enumerator;
    private double denominator;
    
    
    public Fraction(){
        try{
            setEnumerator(0);
            setDenominator(1);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public Fraction(double enumerator, double denominator){
        try{
            setEnumerator(enumerator);
            setDenominator(denominator);
        } catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }

    public double getEnumerator() {
        return enumerator;
    }

    public void setEnumerator(double enumerator) {
        this.enumerator = enumerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) throws Exception {
        if(denominator == 0) {
            throw (new Exception("Denominator tidak boleh 0"));
        }else{
            this.denominator = denominator;
        }
    }
    
    //Penjumlahan
    public Fraction Add(double enumerator, double denominator){
        double resEnum = (getEnumerator() * denominator) + (enumerator * getDenominator());
        double resDenom = getDenominator() * denominator;
        
        Fraction resFraction = new Fraction(resEnum, resDenom);
        return resFraction;
    }
    
    public Fraction Add(Fraction fract){
        Fraction resFraction = Add(fract.getEnumerator(), fract.getDenominator());
        return resFraction;
    }
    
    public static Fraction Add(Fraction fract1, Fraction fract2){
        Fraction resFraction = fract1.Add(fract2);
        return resFraction;
    }
    //=========================================================================
    
    //Pengurangan
    public Fraction Substract(double enumerator, double denominator){
        double resEnum = (getEnumerator() * denominator) - (enumerator * getDenominator());
        double resDenom = getDenominator() * denominator;
        
        Fraction resFraction = new Fraction(resEnum, resDenom);
        return resFraction;
    }
    
    public Fraction Substract(Fraction fract){
        Fraction resFraction = Substract(fract.getEnumerator(), fract.getDenominator());
        return resFraction;
    }
    
    public static Fraction Substract(Fraction fract1, Fraction fract2){
        Fraction resFraction = fract1.Substract(fract2);
        return resFraction;
    }
    //=========================================================================
    
    //Perkalian
    public Fraction Multiply(double enumerator, double denominator){
        double resEnum = getEnumerator() * enumerator;
        double resDenom = getDenominator() * denominator;
        
        Fraction resFraction = new Fraction(resEnum, resDenom);
        return resFraction;
    }
    
    public Fraction Multiply(Fraction fract){
        Fraction resFract = Multiply(fract.getEnumerator(), fract.getDenominator());
        return resFract;
    }
    
    public static Fraction Multiply(Fraction fract1, Fraction fract2){
        Fraction resFract = fract1.Multiply(fract2);
        return resFract;
    }
    
    //=========================================================================
    
    //Pembagian
    public Fraction Division(double enumerator, double denominator){
        double resEnum = getEnumerator() * denominator;
        double resDenom = getDenominator() * enumerator;
        
        Fraction resFraction = new Fraction(resEnum, resDenom);
        return resFraction;
    }
    
    public Fraction Division(Fraction fract){
        Fraction resFract = Division(fract.getEnumerator(), fract.getDenominator());
        return resFract;
    }
    
    public static Fraction Division(Fraction fract1, Fraction fract2){
        Fraction resFract = fract1.Division(fract2);
        return resFract;
    }
    
    
    //=========================================================================
}
