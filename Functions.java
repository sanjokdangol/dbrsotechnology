/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loancalculator;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.text.DecimalFormat;

/**
 *
 * @author sanjok
 */
public class Functions {
    DecimalFormat df = new DecimalFormat("##.00");
    
    private static final int MD5_PASSWORD_LENGTH = 16;

    public static String hashPassword(String password) {
        String hashword = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            BigInteger hash = new BigInteger(1, md5.digest());
            hashword = hash.toString(MD5_PASSWORD_LENGTH);
        } catch (NoSuchAlgorithmException nsae) {
            // handle exception
        }
        return hashword;
    }
    
    public boolean checkAuth(){
        boolean auth = false;
        
        return auth;
    }
  
    
    public double getSimpleInterest(double p, double t, double r){        
        double si=0.0;
        si = p*t*r;
        DecimalFormat df = new DecimalFormat("##.00");
        return Double.parseDouble(df.format(si));      
        
    }
    
    public double getAnnualPayment(double PV, double IR, double NP) {
        double pmt=0.0;
        if(IR > 0)
            IR = IR/100;
        pmt = (PV * IR) / (1 - Math.pow(1 + IR, -NP));
        return Double.parseDouble(df.format(pmt));
    }
    
    public double getDueAmount(double amt,double si,double annualPayment){
        double due =0.0;
	due = (amt+si)-annualPayment;
	return Double.parseDouble(df.format(due));
    }
    
    public double getMonthlyPayment(double p, double r, double n){
        //M = P(1+r)n r / [(1+r)n-1]
        double m=0.0;
        m = p*(Math.pow((1+r), n)*r) / (Math.pow((1+r),n))-1;
        return Double.parseDouble(df.format(m));
    }
    /*
    a is loan amount
    */
    public double getPaymentAmount(double a, double n, double r){
        //P = (r * A ) / ( 1 - (1+r)-n)
        double p=0.0;
        p = (r*a)/(1- Math.pow((1+r), -n));
        return Double.parseDouble(df.format(p));
    }
    
    public double monthlyPayment(double p, double t, double r){
        double payment;
        t *= 12;
        r = r/1200;
        payment = this.getPaymentAmount(p,t,r);
        return payment;
    }
    
}
