package main;

public class Proxy_Pattern_Main {
    public static void main(String[] args) {

        Subject real = new RealSubject();
        Proxy proxy1 = new Proxy(real);
        Proxy proxy2 = new Proxy(real);
        
        proxy1.action1();
        proxy1.action2();
        
        proxy2.action1();
        proxy2.action2();
    }
}
