package patterns.design.CorePatterns.Command;

public class Person {

    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();

        OnCommand on = new OnCommand(television);

        remoteControl.setCommand(on);
        remoteControl.pressButton();

    }
}
