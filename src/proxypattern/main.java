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



public class main {
    public static void main(String[] args) {
      Image image = new ProxyImage("cow.jpg",args);

      image.display(); 
    }
}
