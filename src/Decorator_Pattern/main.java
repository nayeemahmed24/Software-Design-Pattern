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
public class main {
    public static void main(String[] args) {
      food pizza = new pizza();
      add_extra_cheese cheesePizza = new add_extra_cheese(new pizza());
      
      food burger = new burger();
      add_extra_cheese cheeseBurger = new add_extra_cheese(new burger());
      
      
      
      cheesePizza.create_food();
      System.out.println("");
      cheeseBurger.create_food();
      

    }
}
