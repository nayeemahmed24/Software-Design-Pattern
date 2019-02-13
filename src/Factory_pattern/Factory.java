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
public class Factory {
    
    public type_print getPizza(String pizza){
        if(pizza == "cheese"){
            return new cheese_pizza();
        }
        else if(pizza == "margerita"){
            return new margerita_pizza();
        }
        else{
            return null;
        }
    }
    
}
