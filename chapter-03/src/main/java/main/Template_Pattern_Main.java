package main;

public class Template_Pattern_Main {
    public static void main(String[] args) throws Exception {
        AbstractGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("Hello:World");
    }
}
