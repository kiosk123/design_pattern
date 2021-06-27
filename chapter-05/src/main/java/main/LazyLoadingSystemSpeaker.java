package main;

public class LazyLoadingSystemSpeaker {
    private int volume;
    
    private LazyLoadingSystemSpeaker() {
        volume = 5;
    }
    
    private static class LazyHolder {
        public static LazyLoadingSystemSpeaker instance = new LazyLoadingSystemSpeaker();
    }
    
    public static LazyLoadingSystemSpeaker getInstance() {
        return LazyHolder.instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
