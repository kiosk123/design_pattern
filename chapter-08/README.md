# 8. 빌더 패턴 - 2

많은 멤버 변수를 가진 객체 생성  
  
많은 변수를 가진 객체의 생성을 가독성 높도록 코딩할 수 있다.  

## 구현
```java
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    
    public Computer(String cpu, String ram, String storage) {
       this.cpu = cpu;
       this.ram = ram;
       this.storage = storage;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getStorage() {
        return storage;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }
    
    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + "]";
    }
}


// 컴퓨터 객체를 생성하는 빌더
public class ComputerBuilder {
    private Computer computer;
    private ComputerBuilder() {
        computer = new Computer("default","default","default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }
    
    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }
    public static ComputerBuilder startWithCpu(String cpu) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.setCpu(cpu);
        return builder;
    }
    
    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }
    
    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }
    
    public Computer build() {
        return computer;
    }
 }

 //메인
 public class Builder_Pattern_Main {

    public static void main(String[] args) {
        Computer computer = ComputerBuilder
                .start()
                .setCpu("intel")
                .setRam("8G")
                .setStorage("256G")
                .build();
        
        System.out.println(computer);
    }
}

```


