package main.memento;

public class Memento {
    String state;
    
    //외부에서 악의적으로 메멘토 생성 제한 protected
    protected Memento(String state) {
        this.state = state;
    }
    
    protected String getState() {
        return this.state;
    }
}
