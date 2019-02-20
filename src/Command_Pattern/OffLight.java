/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command_Pattern;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class OffLight implements execution{
    lightClass l = new lightClass();
    
    public OffLight(lightClass l){
        this.l = l;
    }
    
    @Override
    public void exc() {
        l.off();
    }
}
