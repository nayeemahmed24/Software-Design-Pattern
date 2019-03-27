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
public class NoCoin implements State {
    Vendor wrapper;
    NoCoin(){
        
    }

   
    public void request(Vendor wrapper) {
        this.wrapper = wrapper;
        wrapper.set_state(new Insert());
        System.out.println("Insert coin");
        callNext();
        
    }
    
    public void callNext(){
        wrapper.request();
    }
    
}
