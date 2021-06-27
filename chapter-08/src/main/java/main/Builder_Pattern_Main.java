package main;

public class Builder_Pattern_Main {

    public static void main(String[] args) {
        Computer computer = ComputerBuilder
                .start()
                .setCpu("intel")
                .setRam("8G")
                .setStorage("256G")
                .build();
        
        System.out.println(computer);
    }
}
