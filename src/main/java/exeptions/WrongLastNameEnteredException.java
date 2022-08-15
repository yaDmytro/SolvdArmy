package exeptions;

public class WrongLastNameEnteredException extends Exception{

    public WrongLastNameEnteredException(String message) {
        super(message);
    }

    public WrongLastNameEnteredException() {
        super("Entered wrong last name.\n Try again.");
    }

}
