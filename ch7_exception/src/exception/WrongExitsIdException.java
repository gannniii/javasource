package exception;

public class WrongExitsIdException extends Exception {
    public WrongExitsIdException() {
        super();
    }

    public WrongExitsIdException(String message) {
        super(message);
    }
}
