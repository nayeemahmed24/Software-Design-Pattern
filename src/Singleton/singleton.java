/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class singleton {
    static singleton hlw = new singleton();
    private int aa ;
    singleton(){
        
    }
    
    public static singleton getInstance(){
        return hlw;
    }
    void print(){
        System.out.println("Hiiiii"+aa);
    }
    
    void set(){
        aa = 10;
    }
    
}
