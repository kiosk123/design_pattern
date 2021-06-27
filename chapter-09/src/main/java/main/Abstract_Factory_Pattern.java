package main;

public class Abstract_Factory_Pattern {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();
        
        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
