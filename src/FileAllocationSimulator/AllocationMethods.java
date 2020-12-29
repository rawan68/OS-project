    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fileallocationsimulator ;
import File.*;
import java.util.ArrayList;


public class AllocationMethods 
{
    private DiskAllocation MyMethod = new DiskAllocation();    
    private ArrayList<IndexedFile> I_Files;// hatetb3etly m el main 
    private ArrayList<LinkedFile> L_Files;// hatetb3etly m el main 
    private ArrayList<File> C_Files;// hatetb3etly m el main 
    ArrayList<Boolean> DiskBlock;
    
    void RunContiguous()
    {
        DiskBlock=MyMethod.getDisk_Blocks();
        for (File File : C_Files) 
        {
            int remainder = MyMethod.getDisk_Capacity()- MyMethod.getDisk_Size();// ba2y ad eh
            if(remainder == 0)
            {
                return;
            }
            else if(remainder < File.getFilesize()) // msh hynf3 yt3mlha allocate
            {
               continue;
            }
            else
            {
                for(int i=MyMethod.getDisk_Size();i<File.getFilesize()+MyMethod.getDisk_Size();i++)
                {
                    MyMethod.getDisk_Blocks().set(i,true); //b3ml allocate l el block elly 7agztaha
                }
                File.setAllocated(true);// el file b2a allocated 
                File.setStartingblock(MyMethod.getDisk_Size());// awel block fady
                MyMethod.setDisk_Size(MyMethod.getDisk_Size()+File.getFilesize());//3mlt update l el dsk size b3d m hagzt meno l elfile 
                File.setEndingblock(MyMethod.getDisk_Size()-1);//a5r block hagztaha
            }
        }
    }
    
    void RunIndexed()
    {
        DiskBlock=MyMethod.getDisk_Blocks();
        for (int i=0;i<I_Files.size();i++)//for loop btemshy 3ala kol el files 
        {
            for(int j=0;j<I_Files.get(i).getFilesize();j++)//for loop btmshy 3ala kol block tshof hyb2a allocated fen
            {
                int remainder = MyMethod.getDisk_Capacity()- MyMethod.getDisk_Size();// ba2y ad eh mn el blocks
                if(remainder == 0)
                {
                    return;
                }
                else if(remainder < I_Files.size()) // msh hynf3 yt3mlha allocate
                {
                    continue;
                }
                else
                {
                    int d=MyMethod.getRandomDiskBlock();//by3ml random block
                    while(!DiskBlock.get(d))
                    {
                       d=MyMethod.getRandomDiskBlock();//bgeb desk block fadya 
                    }
                    DiskBlock.set(d, true);// 3mlna allocation
                    if(j==0)
                    {
                        I_Files.get(i).setStartingblock(d);
                    }
                    if(j==I_Files.get(i).getFilesize()-1)
                    {
                        I_Files.get(i).setEndingblock(d);
                    }
                    I_Files.get(i).getIndex().set(j,d);//
                    //MyMethod.getLocations().add(d); // 3amlna set ll disk ano allocated
                    MyMethod.setDisk_Size(MyMethod.getDisk_Size()+1);
                }
            }
        }
    }
    void RunLinked()
    {
        DiskBlock=MyMethod.getDisk_Blocks();
        for (int i=0;i<L_Files.size();i++)//for loop btemshy 3ala kol el files 
        {
            for(int j=0;j<L_Files.get(i).getFilesize();j++)//for loop btmsy 3ala  kol block tshof hyb2a allocated fen
            {
                int remainder = MyMethod.getDisk_Capacity()- MyMethod.getDisk_Size();// ba2y ad eh mn el blocks
                if(remainder == 0)
                {
                    return;
                }
                else if(remainder < L_Files.size()) // msh hynf3 yt3mlha allocate
                {
                    continue;
                }
                else
                {
                    int d=MyMethod.getRandomDiskBlock();//by3ml random block
                    while(!DiskBlock.get(d))
                    {
                       d=MyMethod.getRandomDiskBlock();//bgeb desk block fadya 
                    }
                    if(j==0)
                    {
                        L_Files.get(i).setStartingblock(d);
                    }
                    else if (j==L_Files.get(i).getFilesize()-1)//byshof law di akhr block fel al file
                    {
                        L_Files.get(i).setEndingblock(d);
                    }
                    
                    L_Files.get(i).getMyList().add(d);// b7ot block num fel list bt3t al mapping 
                    DiskBlock.set(d, true);// 3mlna allocation
                    MyMethod.setDisk_Size(MyMethod.getDisk_Size()+1);// bnzwd 3dd al blocks al allocated
                }
            }
        }
    }
    public AllocationMethods(int choice,ArrayList<Integer>  Disk) 
    {
        switch(choice)
        {
            case 1:
                MyMethod.setDisk_Capacity(Disk.size());
                break;
            case 2:
                MyMethod.setDisk_Capacity(Disk.size());
                break;
            case 3:
                
            default:
                
        }
    }    
}

