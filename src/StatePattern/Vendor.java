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
public class Vendor {
    private State currentState;

    public Vendor() {
        currentState = new NoCoin();
    }

    public void set_state(State s) {
        currentState = s;
    }

    public void request() {
        currentState.request(this);
    }

    
}
