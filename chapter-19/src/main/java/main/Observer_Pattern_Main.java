package main;

/**
 * JDK에서 제공하는 클래스와 인터페이스를 이용한 옵저버 패턴 구현
 */
public class Observer_Pattern_Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.addObserver((o, arg) -> {
            System.out.println(o + "is Clicked");
        });
        
        button.click();
    }
}

