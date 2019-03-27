/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class Dispatch implements State {

    @Override
    public void request(Vendor wrapper) {
         System.out.println("HERE IS UR DRINKS");
    }
    
}
