package main;

public class LgGramBluePrint extends BluePrint {
    private Computer computer;
    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }
    @Override
    public void setCpu() {
      computer.setCpu("intel");
    }

    @Override
    public void setRam() {
       computer.setRam("16G");
    }

    @Override
    public void setStorage() {
      computer.setStorage("256G");
    }
    
    @Override
    public Computer getComputer() {
        return computer;
    }
}
