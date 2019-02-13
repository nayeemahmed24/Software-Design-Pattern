/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_pattern;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class main {
    public static void main(String[] args) {
        Factory f = new Factory();
        type_print t = f.getPizza("cheese");
        t.type();
        
        type_print t2 = f.getPizza("margerita");
        t2.type();
        
        
    }
}
