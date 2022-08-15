package exeptions;

public class WrongWeightEnteredException extends Exception{

    public WrongWeightEnteredException(String message) {
        super(message);
    }

    public WrongWeightEnteredException(){
        super("Entered wrong weight number.\n Try again.");
    }
}
