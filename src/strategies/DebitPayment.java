/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategies;

/**
 *
 * @author mapan
 */
public class DebitPayment implements PayStrategy{

    @Override
    public void pay(double totalPrice) {
        System.out.println("Payed by debit or credit card: " + totalPrice);
    }
    
}
