package main;

public class MpCreator extends ItemCreator {

    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 마나 회복 물약의 정보를 가져옴");
    }

    @Override
    protected void createItemLog() {
        System.out.println("데이터베이스에서 마나 회복 물약 생성");
    }

    @Override
    protected Product createItem() {
        return new MpPotion();
    }

}
