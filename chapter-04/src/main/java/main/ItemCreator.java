package main;

public abstract class ItemCreator {
    // create() 함수가 템플릿 메소드 패턴과 유사
    public Product create() {
        requestItemsInfo();
        Product item = createItem();
        createItemLog();
        return item;
    }
    
    // 아이템 생성전에 데이터 베이스에 아이템 정보 요청
    abstract protected void requestItemsInfo();
    // 아이템 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성
    abstract protected void createItemLog();
    // 아이템 생성 알고리즘
    abstract protected Product createItem();
}
