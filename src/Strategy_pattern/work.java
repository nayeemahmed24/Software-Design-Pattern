/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_pattern;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class work {
    private Sorting strategy;
    
    public work(Sorting strategy){
      this.strategy = strategy;
   }

   public void executework(){
       strategy.sort();
   }
}
