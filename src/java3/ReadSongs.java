/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author azrap
 */
public class ReadSongs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<String> list;
        try {
            BufferedReader br = new BufferedReader(new FileReader("songList.txt"));
            list = new ArrayList<String>();
            String s;
            while((s=br.readLine()) != null){
            list.add(s.substring(0, s.indexOf("/")));
            }
            for(String x: list){
            System.out.println(x);
            }
            
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadSongs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
