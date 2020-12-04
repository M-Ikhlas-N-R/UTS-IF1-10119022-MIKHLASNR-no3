package com.minr;

public class Metal implements HeavyMetal{
    public void genreMetal(String artistName){

    }

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi Heavy Metal");

    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");

    }

    public void genreGrunge(String artistName){

    }
}
