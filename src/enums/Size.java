/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author mapan
 */
public enum Size {

    XS(4), S(5), M(6), L(7), XL(8), XXL(9), XXXL(10);
    private double sizePrice;

    private Size(double sizePrice) {
        this.sizePrice = sizePrice;
    }

    public double getSizePrice() {
        return sizePrice;
    }
    
    
}
