package main;

public class Strategy_Pattern_Main {
    public static void main(String[] args) throws Exception {
        ActionObject actionObject = new ActionObject();
        
        /** 필요에 따라 다른 전략을 주입 후 사용 */
        actionObject.setStrategy(new StrategyImplOne());
        actionObject.action();

        actionObject.setStrategy(new StrategyImplTwo());
        actionObject.action();;
    }
}
