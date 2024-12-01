package gitlet;

/** Driver class for Gitlet, a subset of the Git version-control system.
 *  @author TODO
 */
public class Main {

    /** Usage: java gitlet.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND1> <OPERAND2> ... 
     */
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("You need to provide a command line argument");
            return;
        }
        // TODO: what if args is empty?
        String firstArg = args[0];
        switch(firstArg) {
            case "init":
                // TODO: handle the `init` command
                System.out.println("Initializing...");
                break;
            case "add":
                System.out.println("Adding...");
                // TODO: handle the `add [filename]` command
                break;
                default:
                    System.out.println("Unknown command: " + firstArg);
            // TODO: FILL THE REST IN
        }
    }
}
