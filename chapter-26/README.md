# 26. 커맨드 패턴

커맨드 패턴을 통해 명령을 객체화 할 수 있다.


![.](./img/1.png)


## 구현

```java
// Command 인터페이스
public interface Command {
    public void execute();
}

// 메인 - Command 구현체를 람다로 생성 후 큐에 추가 후 실행
public class Command_Pattern_Main {
    public static void main(String[] args) {
        Queue<Command> queue = new LinkedList<Command>();
        
        queue.add(() -> {
            System.out.println("명령 1");
        });
        
        queue.add(() -> {
            System.out.println("명령 2");
        });
        
        queue.add(() -> {
            System.out.println("명령 3");
        });
        
        queue.stream().forEach((cmd) -> {
            cmd.execute();
        });
        
    }
}

```