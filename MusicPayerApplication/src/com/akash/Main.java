package com.akash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the title of song: ");
        String titel=scanner.nextLine();
        System.out.println("Enter the arist Name: ");
        String artist=scanner.nextLine();
        System.out.println("Enter the duration of song: ");
        float douration=scanner.nextFloat();


        //Creating song
        Song song1=new Song(titel,artist,douration);
        System.out.println(song1);
        System.out.println("Sccessfull add song");

        //Creating playlist
        System.out.println("Enter the playlist name: ");
        String name=scanner.nextLine();
        Playlist playlist1=new Playlist(name);
        playlist1.addSong(song1);
        System.out.println("Add Sccessfull playlsis name");

        //Creating user to managing playilst
        System.out.println("Enter the user name and password");
        String username=scanner.nextLine();
        String password=scanner.nextLine();
        User user1=new User(username,password);
        System.out.println("Enter the  new playlist name: ");
        String playlistName=scanner.nextLine();
        user1.addPlaylist(playlistName);//create new Playlist
        user1.revomvePlaylist(playlist1);//Dlaeting playlist

        //creating music to intrecting song
        MusicPlayer music=new MusicPlayer(song1);
        music.pushSong();
        music.stopPlaying();
        music.skipSong();


        }
    }