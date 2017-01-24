/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Songs;
import java.io.*;
import java.util.*;
/**
 *
 * @author azrap
 */
public class SongList implements Comparable<SongList> {
    
    private String name, artist, genre;
    private int year;

    public SongList(String name, String artist, String genre, int year) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "SongList{" + "name=" + name + ", artist=" + artist + ", genre=" + genre + ", year=" + year + '}';
    }

    @Override
    public int compareTo(SongList sl) {
        Integer y = this.year;
        return artist.compareTo(sl.getArtist()) == 0 ? y.compareTo(sl.getYear()) : artist.compareTo(sl.getArtist());
    }
    
    
    
    
}
