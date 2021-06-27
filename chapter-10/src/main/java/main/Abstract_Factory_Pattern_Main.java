package main;

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
