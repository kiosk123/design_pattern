package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Mediator {
    protected List<Colleague> colleagues = new ArrayList<>();
    
    public boolean addColleague(Colleague colleague) {
        Optional<Colleague> op = Optional.ofNullable(colleague);
        op.orElseThrow(() -> new NullPointerException());
        return colleagues.add(colleague);
    }
    
    abstract protected void mediate(String data);
}
