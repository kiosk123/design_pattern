package main;

public class Bridge_Pattern_Main {

    /**
     * 기능과 구현의 분리
     */
    public static void main(String[] args) {
        PrintMorseCode pmc = new PrintMorseCode(new DefaultMCP());
        pmc.a().g().m().r();
        
        System.out.println();
        
        pmc = new PrintMorseCode(new SoundMCP());
        pmc.a().g().m().r();
    }

}
