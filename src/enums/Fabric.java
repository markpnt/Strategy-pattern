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
public enum Fabric {
    
     WOOL(6), COTTON(7), POLYESTER(8), RAYON(9), LINEN(10), CASHMERE(11), SILK(12);
     private final double fabricPrice;

    private Fabric(double fabricPrice) {
        this.fabricPrice = fabricPrice;
    }

    public double getFabricPrice() {
        return fabricPrice;
    }
     
     
}
