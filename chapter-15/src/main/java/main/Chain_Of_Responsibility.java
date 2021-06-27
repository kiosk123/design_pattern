package main;

public class Chain_Of_Responsibility {

    public static void main(String[] args) {
        Calculator plus = new PlusCalculator();
        Calculator sub = new SubCalculator();
        
        plus.setNextCalculator(sub);
        Request request1 = new Request(1,2,"+");
        Request request2 = new Request(10,2,"-");
        
        plus.process(request1);
        sub.process(request2);
    }
}
