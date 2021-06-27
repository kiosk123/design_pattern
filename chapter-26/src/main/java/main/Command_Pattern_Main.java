package main;

import java.util.LinkedList;
import java.util.Queue;

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
