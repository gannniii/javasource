package exception;

public class NotExitsIdException extends Exception {
    public NotExitsIdException() {
        super();
    }

    public NotExitsIdException(String message) {
        super(message);
    }
}
