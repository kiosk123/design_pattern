package main;

/**
 * 인스턴스 한번만 생성
 *
 */
public class SystemSpeaker {
    private static SystemSpeaker instance;
    private int volume;
    
    private SystemSpeaker() {
        volume = 5;
    }
    
    public static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
