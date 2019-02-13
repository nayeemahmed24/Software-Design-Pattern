/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[] ara = new int[5];
       work w = new work(new bubble_sort(ara));		
       w.executework();
      // bubble_sort b = new bubble_sort(ara);
       
    }
    
}
