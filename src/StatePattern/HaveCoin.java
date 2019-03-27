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
public class HaveCoin implements State{
    Vendor wrapper;
    
    @Override
    public void request(Vendor wrapper) {
        this.wrapper = wrapper;
        wrapper.set_state(new Accepted());
        System.out.println("Machine is processing request");  
        callNext();
    }
    public void callNext(){
        wrapper.request();
    }
}
