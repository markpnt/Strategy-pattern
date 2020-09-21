/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import enums.ColorTshirt;
import enums.Fabric;
import enums.Size;
import strategies.PayStrategy;

/**
 *
 * @author mapan
 */
public class Tshirt {
    
    private PayStrategy payStrategy;
    private final ColorTshirt colorTshirt;
    private final Size size;
    private final Fabric fabric;

    public Tshirt(PayStrategy payStrategy, ColorTshirt colorTshirt, Size size, Fabric fabric) {
        this.payStrategy = payStrategy;
        this.colorTshirt = colorTshirt;
        this.size = size;
        this.fabric = fabric;
    }
    
    public void executePayStrategy(){
        System.out.println("The T-shirt with color: " + this.colorTshirt 
                + " size: " + this.size + " and fabric: " + this.fabric);
        double totalPrice = calculatePrice();
        payStrategy.pay(totalPrice);
    } 
    
    public double calculatePrice(){
        double colorPrice = this.colorTshirt.getColorPrice();
        double sizePrice = this.size.getSizePrice();
        double fabricPrice = this.fabric.getFabricPrice();
        double tax = 1.24;
        double totalPrice = Math.round((colorPrice + sizePrice + fabricPrice) * tax * 100.0) / 100.0;
        return totalPrice;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
    
    
}
