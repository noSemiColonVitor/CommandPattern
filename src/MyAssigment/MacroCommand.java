package MyAssigment;

public class MacroCommand implements Command {
    Receiver[] receivers;

    public MacroCommand (Receiver[] commands) {
        this.receivers = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < receivers.length; i++){
            receivers[i].execute(receivers[i].toString());
        }
    }

    @Override
    public void undo() {
        for (int i = receivers.length  ; i > 0 ; i--){
            // because the first item of array starts with 0 I need to subtract 1 from i
            int j = i - 1;
            receivers[j].undo(receivers[j].toString());
        }
    }
}

/*
Source code: https://github.com/noSemiColonVitor/assignments
 */

