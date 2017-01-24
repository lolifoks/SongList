/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Songs;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author azrap
 */
public class Songs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        TreeSet<SongList> col;
        try {
            BufferedReader br = new BufferedReader(new FileReader("songList.txt"));
            col = new TreeSet<SongList>();
            String s;
            while((s=br.readLine()) != null){
            String sng[] = s.split("/");
            col.add(new SongList(sng[0], sng[1], sng[2], Integer.parseInt(sng[3])));
            }
            for(SongList x : col){
            
            System.out.println(x);
            }
            br.close();
            }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Songs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
