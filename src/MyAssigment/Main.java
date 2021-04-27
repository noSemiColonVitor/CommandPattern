package MyAssigment;

public class Main {
    public static void main(String[] args){
        Invoker remote = new Invoker();
        Receiver[] receiver = new Receiver[4];
        receiver[0] = new Receiver();
        receiver[1] = new Receiver();
        receiver[2] = new Receiver();
        receiver[3] = new Receiver();

        MacroCommand lightOn = new MacroCommand(receiver);
        remote.setCommand(lightOn);

        //execute command
        remote.execute();

        //undo command
        remote.undo();
    }
}
