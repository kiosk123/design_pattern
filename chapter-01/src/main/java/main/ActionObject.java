package main;

import java.util.Optional;

public class ActionObject {
    Strategy strategy;
    public ActionObject() {
        
    }
    
    public ActionObject(Strategy strategy) {
        setStrategy(strategy);
    }
    
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void action() throws Exception{
        Optional<Strategy> op = Optional.ofNullable(strategy);
        op.orElseThrow(() -> new Exception("Ainterface not set Exception"));
        strategy.action();
    }
}
