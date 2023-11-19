package com.akash;

import java.util.ArrayList;
import java.util.List;

//user class contions username and password which palylist
public class User {
    private String username;
    private String password;
    private List<Playlist> playlists;
    public User(String username,String Password){
        this.username=username;
        this.password=password;
        this.playlists=new ArrayList<>();
    }
//Method to add playlist
    public void addPlaylist(String playlistName){
        Playlist newplaylist=new Playlist(playlistName);
        playlists.add(newplaylist);
    }
    public void revomvePlaylist(Playlist playlist ){
    playlists.remove(playlist);
    }
}
