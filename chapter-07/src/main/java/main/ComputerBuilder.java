package main;

public class ComputerBuilder {
    private BluePrint print;

    public void setPrint(BluePrint print) {
        this.print = print;
    }
    
    public void build() {
        print.setCpu();
        print.setCpu();
        print.setStorage();
    }
    
    public Computer getComputer() {
        return print.getComputer();
    }
}
