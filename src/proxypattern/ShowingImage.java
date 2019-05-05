/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;



/**
 *
 * @author Hp
 */
public class ShowingImage  implements Image {
   private String fileName;
   private String[] args;

   public ShowingImage(String fileName,String[] args){
      this.fileName = fileName;
      this.args = args;
   }

   @Override
   public void display() {
     ImageExample.kk(fileName,args);
   }

   
   

    
}