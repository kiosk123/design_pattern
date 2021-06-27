package main;

public class Observer_Pattern_Main {

    public static void main(String[] args) {
        Button button = new Button((btn) -> {
            System.out.println(btn + "is Clicked");
        });
        button.click();
    }
}

