package exeptions;

public class WrongNameEnteredException extends Exception{

    public WrongNameEnteredException(String message) {
        super(message);
    }

    public WrongNameEnteredException() {
        super("Entered wrong first name.\n Try again.\n");
    }
}
