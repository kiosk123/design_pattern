package main;

import java.util.Optional;

public abstract class Colleague {
    //어떤 중재자에 속해 있는지...
    Mediator mediator;
    
    public boolean join(Mediator mediator) {
        this.mediator = mediator;
        return this.mediator.addColleague(this);
    }
    // 중재자로 데이터 전달처리
    public void sendData(String data) {
        Optional<String> op = Optional.ofNullable(data);
        op.orElseThrow(() -> new NullPointerException());
        mediator.mediate(data);
    }
    
    // 중재자로 전달받은 데이터 처리
    abstract void handle(String data);
}
