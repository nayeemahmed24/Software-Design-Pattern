/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositePattern;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class driverClass {
    public static void main(String[] args) {
        file a = new file("Tamim");
        file ab = new file("Rafiul");
        file abc = new file("God");
        
        composite lastRoll = new composite(); 
        lastRoll.addiFile(a); 
        lastRoll.addiFile(ab);
        lastRoll.addiFile(abc);
        
        directory aa = new directory("Soive");
        directory aab = new directory("Munif");
        directory aabc = new directory("Maruf");
        
        composite firstRoll = new composite(); 
        lastRoll.addiFile(aa); 
        lastRoll.addiFile(aab);
        lastRoll.addiFile(aabc);
        
         composite adder = new composite();
         adder.addiFile(lastRoll);
         adder.addiFile(firstRoll);
         
         adder.ls();
         
         
         
        
        
        
        
    }
}
