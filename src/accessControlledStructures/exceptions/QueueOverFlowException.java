package accessControlledStructures.exceptions;

public class QueueOverFlowException extends RuntimeException {
    public QueueOverFlowException(String message) {

        super(message);
    }

    public QueueOverFlowException(){
        super();
    }
}
