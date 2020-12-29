/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileallocationsimulator;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Eng
 */
public class DiskAllocation
{
    //da array kol index fe 3obara 3an alblock bta3t al file wgwaha al corresponding disk block
    private ArrayList<Boolean> Disk_Blocks =new ArrayList() ;
    private int Disk_Capacity;//al disk size
    private int Disk_Size=0;//no of allocated blocks
    Random random = new Random();
    
   
    
    public ArrayList<Boolean> getDisk_Blocks()
    {
        return Disk_Blocks;
    }

    public void setDisk_Blocks(ArrayList<Boolean> Disk_Blocks) 
    {
        this.Disk_Blocks = Disk_Blocks;
    }

    public int getDisk_Capacity() 
    {
        return Disk_Capacity;
    }

    public void setDisk_Capacity(int Disk_Capacity) 
    {
        this.Disk_Capacity = Disk_Capacity;
    }

    public int getDisk_Size() 
    {
        return Disk_Size;
    }

    public void setDisk_Size(int Disk_Size) 
    {
        this.Disk_Size = Disk_Size;
    }
    public int getRandomDiskBlock()
    {
        return random.nextInt(getDisk_Capacity());
    }  
    
}
