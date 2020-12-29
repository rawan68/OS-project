/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

/**
 *
 * @author Eng 
 */
//gwaha al mapping bta3 kol file 
//a7na lma bnegy n3ml allocation ll file bn3ml array mn al class di kol index fel array yo3tbr file 
//alclass kol file leh size 3obara 3an no of blocks bn3mlha allocation hnak fel run
public class File 
{
    
    private String filename;
    private int startingblock;
    private int endingblock;
    private int filesize;
    private boolean allocated = false;
//m3naha an al file aloocated wla la 3ala 7asb law al no of block bt3to kolha ba2t allocated hnak aw fadya

    public int getStartingblock() {
        return startingblock;
    }

    public void setStartingblock(int startingblock) {
        this.startingblock = startingblock;
    }

    public int getEndingblock() {
        return endingblock;
    }

    public void setEndingblock(int endingblock) {
        this.endingblock = endingblock;
    }
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }



    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public void setAllocated(boolean allocated) {
        this.allocated = allocated;
    }
}
