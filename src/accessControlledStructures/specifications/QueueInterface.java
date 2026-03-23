package accessControlledStructures.specifications;

import accessControlledStructures.exceptions.QueueOverFlowException;
import accessControlledStructures.exceptions.QueueUnderFlowException;

public interface QueueInterface<T> {

    void enqueue(T element) throws QueueOverFlowException;
    void dequeue() throws QueueUnderFlowException;
    boolean isFull();
    boolean isEmpty();
    int size();
}
