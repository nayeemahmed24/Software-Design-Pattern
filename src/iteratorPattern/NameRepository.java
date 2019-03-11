/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

import java.util.ArrayList;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class NameRepository implements Container {
   public String names[] ;

   NameRepository(){
       names = new String[100];
   }
   @Override
   public Iterator getIterator() {
      return new NameIterator(names);
   }
   
   void addItem(String sss){
       this.addItem(sss);
   }
}