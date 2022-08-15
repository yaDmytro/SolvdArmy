package exeptions;

public class WrongAgeEnteredException extends Exception{

    public WrongAgeEnteredException(String message) {
        super(message);
    }

    public WrongAgeEnteredException(){
        super("Entered wrong age number.\n Try again.");
    }
}
