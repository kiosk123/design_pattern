package main;


/**
 * 메모리를 가볍게 한다 - 풀(Pool)개념..
 * 가져올려는 데이터가 없으면 생성 후 가져오고 있으면 기존의 데이터를 가져옴
 * @author USER
 *
 */
public class Flyweight_Pattern_Main {
    public static void main(String[] args) {
       FlyweightFactory factory = new FlyweightFactory();
       Flyweight flyweight = factory.getFlyweight("A");
       System.out.println(flyweight.getData());
       
       flyweight = factory.getFlyweight("A");
       System.out.println(flyweight.getData());
    }
}
