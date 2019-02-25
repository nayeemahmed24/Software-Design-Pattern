/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator_Pattern;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class pizza implements food {

    @Override
    public void create_food() {
        System.out.println("Pizza is created");
    }
    
}
