package main;

public class MpPotion implements Product {

    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
