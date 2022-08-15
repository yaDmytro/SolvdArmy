package exeptions;

public class WrongHeightEnteredException extends Exception{

    public WrongHeightEnteredException(String message) {
        super(message);
    }

    public WrongHeightEnteredException(){
        super("Entered wrong height number.\n Try again.");
    }
}
