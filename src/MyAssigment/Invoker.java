package MyAssigment;

public class Invoker {
    Command slot;

    public Invoker () {}

    public void setCommand(Command command){
        slot = command;
    }

    public void execute(){
        slot.execute();
    }

    public void undo(){
        slot.undo();
    }
}
