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
public class add_extra_cheese extends add_extra_toopings {
    
    public add_extra_cheese(food Food) {
        super(Food);
    }
    @Override
   public void create_food() {
      Food.create_food();
      addChesse(Food);
   }

   private void addChesse(food Food){
      System.out.println("Extra Cheese added");
   }
}
