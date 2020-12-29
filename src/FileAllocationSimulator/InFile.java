
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileallocationsimulator;
/**
 *
 * @author Eng
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class InFile<type> implements Serializable
{
    File MyFlie;
    OutFile<type> read=new OutFile<>();
    ArrayList<type> mydata=new ArrayList<>();
    public void Write(Object myobject , String path)
    {
        try
        { 
            MyFlie= new File(path);
            MyFlie.createNewFile();
            mydata=read.Read(path);
            FileOutputStream myfile = new FileOutputStream(MyFlie);
            try (ObjectOutputStream in =new ObjectOutputStream(myfile))
            {
                in.writeObject(myobject);
                in.close();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void Write(ArrayList<type> data , String path) throws IOException
    {
        MyFlie= new File(path);
        MyFlie.createNewFile();
        try
        {
            FileOutputStream myfile = new FileOutputStream(MyFlie);
            try (ObjectOutputStream in =new ObjectOutputStream(myfile))
            {
                in.writeObject(data);
                in.close();
            }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
   

}

