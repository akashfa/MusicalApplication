package com.akash;

import java.util.ArrayList;
import java.util.List;
//Playlist class contions collection of song
public class Playlist {
    private String name;
    private List<Song> songs;
    public Playlist(String name){
        this.name=name;
        this.songs=new ArrayList<>();
    }
    //create method add song in playlist
    public void addSong(Song song){
      songs.add(song);
    }
    //Method remove song in playlist
    public void removeSong(Song song){
         songs.remove(song);
    }
    //Method to reorder song in playlist
    public void reorderSong(int fromInd,int toInd){
         if(fromInd>=0&&fromInd<songs.size()&&toInd>=0&&toInd<songs.size()) {
             Song songtoMove=songs.remove(fromInd);
             songs.add(toInd,songtoMove);
         }else{
             System.out.println("invlid is index number");
         }
    }
    //Method to get Palylist
    public void getPalylist(){
        System.out.println(name);
    }
}
