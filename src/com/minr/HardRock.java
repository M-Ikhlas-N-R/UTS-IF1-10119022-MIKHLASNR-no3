package com.minr;

public class HardRock implements PopRock, ProgressiveRock, PsychedelicRock {
    public void genreHardRock(String artistName){

    }
    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName + " adalah musisi PopRock");

    }

    @Override
    public void genrePsycehedellic(String artistName) {
        System.out.println(artistName + " adalah musisi Psycehedellic");

    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName + " adalah musisi ProgressiveRock");
    }
}
