package main;

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

class LinuxButton implements Button {

    @Override
    public void click() {
      System.out.println("linux button");
    }

}

class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "linux text area";
    }

}
