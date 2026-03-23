package accessControlledStructures.exceptions;

public class QueueUnderFlowException extends RuntimeException {
    public QueueUnderFlowException(String message) {
        super(message);
    }
    public QueueUnderFlowException(){super();}
}
