# 20. 옵저버 패턴 - 3

1. jdk Observable을 제네릭으로 받을 수 있게 변경한다.  
2. 델리게이트를 사용한다. - 상속하지 않고 클래스 멤버로 선언해서 사용 
3. Observable 안에 옵저버를 넣는다.

```java
//제네릭으로 변경된 Observable을 main패키지의 Observable.java 참고

// Observable을 델리케이트한 Button 클래스
public class Button {

    public Button() {
        observable = new Observable<String>();
    }
    
    private Observable<String> observable;
    
    public void addObserver(Observer<String> o) {
        observable.addObserver(o);
    }
    
    public void notifyObservers() {
        observable.notifyObservers(null);
    }

    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }
    
}

//메인
public class Observer_Pattern_Main {
    public static void main(String[] args) {
        // 1. 제네릭
        // 2. 델리케이트
        // 3. 내부에 옵저버를 넣는다.
        
        Button button = new Button();
        button.addObserver(new Observer<String>() {
            @Override
            public void update(Observable<String> o, String arg) {
                System.out.println(o+" is clicked");
            }
        });
        
        button.onClick();
        button.onClick();
        button.onClick();
    }
}
```

- 고급 구현 [참고](https://velog.io/@hanna2100/%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4-2.-%EC%98%B5%EC%A0%80%EB%B2%84-%ED%8C%A8%ED%84%B4-%EA%B0%9C%EB%85%90%EA%B3%BC-%EC%98%88%EC%A0%9C-observer-pattern)

