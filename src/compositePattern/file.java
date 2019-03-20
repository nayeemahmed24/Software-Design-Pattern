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
public class file implements iFile{
    
    String name;
     
    file(String name){
        this.name = name;
    }
    
    @Override
    public void ls() {
        System.out.println(name + "I am a file" );
           
    }
    
}
