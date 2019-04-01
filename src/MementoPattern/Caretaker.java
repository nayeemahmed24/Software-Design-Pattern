/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    private int track = 0;

   public void add(Memento state){
      mementoList.add(state);
      track++;
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
   
   public Memento undo()
    {
        track--;
        System.out.println("Undo done : now State is "+mementoList.get(track-1).getState());
        return mementoList.get(track-1);
    }
    public Memento redo()
    {
        track++;
        System.out.println("Redo done : now State is "+mementoList.get(track-1).getState());
        return mementoList.get(track-1);
    }
}
