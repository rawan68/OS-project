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

public class LinkedFile extends File
{
    private ArrayList<Integer> allocationList = new ArrayList();

    public ArrayList getMyList()
    {
        return allocationList;
    }

    public void setMyList(ArrayList<Integer> myList)
    {
        this.allocationList = myList;
    }
}