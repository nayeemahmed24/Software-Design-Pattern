/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class directory implements iFile {
    String name;
     
    directory(String name){
        this.name = name;
    }
    
    
    @Override
    public void ls() {
        System.out.println(name + "I am a directory" );
        
    }
    
}
