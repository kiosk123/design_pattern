package main;

public class ChatMediator extends Mediator {

    @Override
    protected void mediate(String data) {
        colleagues.stream().forEach((colleague) -> {
            //여러 패턴의 중재 ... 여기서는 간단히 데이터만 보내는 걸로
            colleague.handle(data);
        });
    }

}
