package main;

public abstract class Component {
    private String name;
    
    protected Component(String name) {
       this.name =  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
