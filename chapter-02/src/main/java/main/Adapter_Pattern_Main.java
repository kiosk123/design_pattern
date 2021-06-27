package main;

public class Adapter_Pattern_Main {
    public static void main(String[] args) throws Exception {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(20.0f));
        System.out.println(adapter.halfOf(40.0f));
    }
}
