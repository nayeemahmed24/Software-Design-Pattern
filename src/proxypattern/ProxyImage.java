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
public class ProxyImage implements Image  {

   private ShowingImage realImage;
   private String fileName;
   private String[] args;
   

   public ProxyImage(String fileName,String[] args){
      this.fileName = fileName;
      this.args = args;
      
      
   }

    

   @Override
   public void display() {
      if(realImage == null){
         realImage = new ShowingImage(fileName,args);
      }
      realImage.display();
   }
}