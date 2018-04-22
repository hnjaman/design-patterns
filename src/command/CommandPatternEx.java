package command;

public class CommandPatternEx {
    public static void main(String[] args)
    {
        System.out.println("***Command Pattern Demo***\n");

        Receiver intendedreceiver=new Receiver();

        /*Client holds Invoker and Command Objects*/
        Invoke inv = new Invoke();

        MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
        inv.ExecuteCommand(unCmd);
        inv.ExecuteCommand(reCmd);
    }
}
