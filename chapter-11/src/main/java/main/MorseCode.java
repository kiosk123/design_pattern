package main;

/**
 * MorseCodeFunction 구현체의 Delegate 역할
 */
public class MorseCode {
    private MorseCodeFunction function;
    protected MorseCode(MorseCodeFunction function) {
        this.function = function;
    }
    
    protected void dot() {
        function.dot();
    }
    
    protected void dash() {
        function.dash();
    }
    
    protected void space() {
        function.space();
    }
}
