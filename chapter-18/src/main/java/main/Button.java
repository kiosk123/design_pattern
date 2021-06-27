package main;

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
