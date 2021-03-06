# 10. 추상 팩토리 패턴 - 2

## 구현

```java
//추상화된 텍스트 에어리어 클래스
public interface TextArea {
    public String getText();
}

//추상화된 버튼 클래스
public interface Button {
    public void click();
}

//추상화된 팩토리 클래스
public interface GuiFactory {
    Button createButton();
    TextArea createTextArea();
}

//GUI 팩토리 구현체 및 버튼과 텍스트 에어리어 구현체 클래스
public class FactoryInstance {
    public static GuiFactory getGuiFactory() {
      
       
       switch(getOsCode()) {
       case 0:
           return new LinuxGuiFactory();
       case 1:
           return null;
       case 2:
           return null;
       default:
           return null;
       }
    }
    
    private static int getOsCode() {
        String os = System.getProperty("os.name");
        int ret = 0;
        if (os == null) {
            ret = 0;
        } else if (os.equalsIgnoreCase("windows")) {
            ret = 1;
        } else if (os.equalsIgnoreCase("linux")) {
            ret = 0;
        }
        return ret;
    }
}

// GUI 팩토리 구현체
class LinuxGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}

//버튼 구현체
class LinuxButton implements Button {

    @Override
    public void click() {
      System.out.println("linux button");
    }

}

// 텍스트 에어리어 구현체
class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "linux text area";
    }

}


//메인
public class Abstract_Factory_Pattern_Main {

    public static void main(String[] args) {
//       GuiFactory factory = new LinuxGuiFactory();
        
       GuiFactory factory = FactoryInstance.getGuiFactory();
       Button button = factory.createButton();
       TextArea txArea = factory.createTextArea();
       
       button.click();
       System.out.println(txArea.getText());
    }
}

```