/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import enums.ColorTshirt;
import enums.Fabric;
import enums.Size;
import strategies.BankPayment;
import strategies.CashPayment;
import strategies.DebitPayment;

/**
 *
 * @author mapan
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt(new DebitPayment(), ColorTshirt.ORANGE, Size.S, Fabric.RAYON);
        tshirt.executePayStrategy();
        
        Tshirt tshirt2 = new Tshirt(new CashPayment(), ColorTshirt.YELLOW, Size.XXXL, Fabric.WOOL);
        tshirt2.executePayStrategy();
        
        tshirt.setPayStrategy(new BankPayment());
        tshirt.executePayStrategy();
    }
    
}
