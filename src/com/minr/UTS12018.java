package com.minr;

public class UTS12018 {
    public static void main(String[] args) {
        RnB musisi1 = new RnB();
        musisi1.genreBlues("Jimmy Hendrik");
        musisi1.genreJazz("Chad Baker");

        Folk musisi2 = new Folk();
        musisi2.genreFolk("Bob Dylan");

        Rockabilly musisi3 = new Rockabilly();
        musisi3.genreRockabilly("Elvis");

        HardRock musisi4 = new HardRock();
        musisi4.genreProgressiveRock("DreamTheater");

        musisi4.genrePsycehedellic("The Doors");
        musisi4.genrePopRock("Kiss");

        Metal musisi5 = new Metal();
        musisi5.genrePunk("MXPX");
        musisi5.genreHeavyMetal("METALLICA");

        Grindcore musisi6 = new Grindcore();
        musisi6.genreGrindcore("Mesin Tempur");

        DeathMetal musisi7 = new DeathMetal();
        musisi7.genreDeathMetal("JASAD");

        DeathCoreKepiting musisi8 = new DeathCoreKepiting();
        musisi8.genreDeathCoreKepiting("Revenge The Fate");

        BlackMetal musisi9 = new BlackMetal();
        musisi9.genreBlackMetal("Bahemoth");

        NewSkul musisi10 = new NewSkul();
        musisi10.genreNewSkul("HATEBREED");
    }
}
