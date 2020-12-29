/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.util.ArrayList;

/**
 *
 * @author Eng
 */
//gwaha al mapping bta3 al file al hwa fe al index al shayl kol almemory block al at7gzt
public class IndexedFile extends File 
{
    private ArrayList<Integer> index =new ArrayList(); // al array al shayl almemory blocks

    public ArrayList<Integer> getIndex() {
        return index;
    }

    public void setIndex(ArrayList<Integer> index) {
        this.index = index;
    }
    
}
