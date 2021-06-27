package main;

public class Factory_Method_Pattern_Main {

    public static void main(String[] args) {
        ItemCreator creator = new HpCreator();
        Product item = creator.create();
        item.use();
        
        creator = new MpCreator();
        item = creator.create();
        item.use();
    }

}
