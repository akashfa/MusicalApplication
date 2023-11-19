package com.akash;

public class MusicPlayer {
    private Playlist currentPlaylist;
    private Song currentSong;
    private boolean isPalying;
    public MusicPlayer(Song song){
        //Loigc to start proveding song
        System.out.println("playing:"+ song.getTitle());
        this.currentSong=song;
        this.isPalying=true;
    }
    //Method to push song
public void pushSong(){
        System.out.println("pussing: "+ currentSong.getTitle());
        this.isPalying=false;
}
//Method to stop playBack
    public void stopPlaying(){
        System.out.println("Stop is playing");
        this.isPalying=false;
    }
    //Method to skip song
    public void skipSong(){
        System.out.println("Skeeping song");
        this.isPalying=false;
    }
}
