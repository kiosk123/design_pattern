package main;

public class ChatColleague extends Colleague {

    @Override
    void handle(String data) {
        System.out.println(this + "-" + data);
    }
}
