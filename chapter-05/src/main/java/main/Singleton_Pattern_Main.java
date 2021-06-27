package main;

public class Singleton_Pattern_Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();
        
        System.out.println(speaker1.getVolume()); //5
        System.out.println(speaker2.getVolume()); //5 
        
        speaker1.setVolume(10);
        
        System.out.println(speaker1.getVolume()); //10
        System.out.println(speaker2.getVolume()); //10
    }

}

