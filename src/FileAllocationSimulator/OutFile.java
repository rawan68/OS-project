
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class OutFile<T> implements Serializable
{
    File MyFlie;
    
    public ArrayList<T> Read(String address) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        ArrayList<T> mydata=new ArrayList<>();
        MyFlie=new File(address);
        try
        {
            MyFlie.createNewFile();
        } catch (IOException ex) 
        {
            System.out.println(ex);
        }
        try
        {
            FileInputStream myFile =  new FileInputStream(address);
            ObjectInputStream NF = new ObjectInputStream(myFile);
            mydata=(ArrayList<T>)NF.readObject();
            NF.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       return mydata;
    }
    public void Read(T mo,String address) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        MyFlie=new File(address);
        try
        {
            MyFlie.createNewFile();
        } catch (IOException ex) 
        {
            System.out.println(ex);
        }
        try
        {
            FileInputStream myFile =  new FileInputStream(address);
            ObjectInputStream NF = new ObjectInputStream(myFile);
            mo=(T)NF.readObject();
            NF.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
