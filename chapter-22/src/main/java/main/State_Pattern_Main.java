package main;

/**
 * 상태 패턴을 통해 상태를 객체로 나타내공 행동을 구현
 * @author USER
 */
class State_Pattern_Main {
    public static void main(String[] args) {
        Light light = new Light();
        
        light.off();
        light.off();
        light.off();
        
        light.on();
        light.on();
        
        light.off();
        light.on();
        light.off();
    }
}
