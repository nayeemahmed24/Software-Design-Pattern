/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

/**
 *
 * @author CSE CARNIVAL 2017
 */
 class NameIterator implements Iterator {

      int index;
      String names[];
      NameIterator(String names[]){
          this.names = names;
      }

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }
      
      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }
 }