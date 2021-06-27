# 18. 옵저버 패턴 - 1

옵저버 패턴을 통해 이벤트 발생 후 객체 외부에서 처리할 수 있다.  
  
객체외부/이벤트 처리

![.](./img/1.png)
- Target 객체가 옵저버 인터페이스를 가지고 있어서 notify()에서 update()를 호출해서 해당 옵저버가 타겟객체의 이벤트 처리된 것을 확인하는 패턴이다

## 구현
```java
public class Button {
    public Button(OnclickListener onclickListener) {
        this.onclickListener = onclickListener;
    }

    public void click() {
        //이벤트 처리
        if (onclickListener != null) {
            onclickListener.click(this);
        }
    }
    
    public interface OnclickListener {
        public void click(Button button);
    }
    
    private OnclickListener onclickListener;

    public void setOnclickLinstener(OnclickListener onclickListener) {
        this.onclickListener = onclickListener;
    }
}

//메인
public class Observer_Pattern_Main {

    public static void main(String[] args) {
        Button button = new Button((btn) -> {
            System.out.println(btn + "is Clicked");
        });
        button.click();
    }
}

```