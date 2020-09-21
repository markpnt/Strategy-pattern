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
public enum ColorTshirt {

    RED(5), ORANGE(6), YELLOW(7), GREEN(8), BLUE(9), INDIGO(10), VIOLET(11);
    private double colorPrice;

    private ColorTshirt(double colorPrice) {
        this.colorPrice = colorPrice;
    }

    public double getColorPrice() {
        return colorPrice;
    }
    
    
}
