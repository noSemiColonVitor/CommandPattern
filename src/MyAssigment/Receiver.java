package MyAssigment;

public class Receiver {
    public void execute(String s){
        System.out.println("Receiver: "+s+" executed");
    }

    public void undo(String s){
        System.out.println("Receiver: "+s+" undid");
    }
}
