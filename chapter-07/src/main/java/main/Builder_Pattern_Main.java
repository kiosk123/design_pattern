package main;

public class Builder_Pattern_Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.setPrint(new LgGramBluePrint());
        builder.build();
        Computer computer = builder.getComputer();
        System.out.println(computer);
    }
}
