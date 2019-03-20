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
public class composite implements iFile {
    private List<iFile> fileList = new ArrayList<iFile>(); 
    
    @Override
    public void ls() {
       for(iFile emp:fileList) 
        { 
            emp.ls(); 
        } 
    }
    
    public void addiFile(iFile emp) 
    { 
        fileList.add(emp); 
    } 
    
}
