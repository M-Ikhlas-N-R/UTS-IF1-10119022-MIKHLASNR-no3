package com.minr;

public class RnB extends MusicGenre implements Blues, Jazz{
    public void genreJazz(String artistName){
        System.out.println(artistName + " adalah musisi Jazz");
    }

    public void genreBlues(String artistName){
        System.out.println(artistName + " adalah musisi Blues");
    }
}
