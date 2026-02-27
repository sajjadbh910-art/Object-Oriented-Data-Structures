package accessControlledStructures.specifications;

import accessControlledStructures.exceptions.StackOverFlowException;
import accessControlledStructures.exceptions.StackUnderFlowException;

public interface StackInterface<T> {

    void push(T element)throws StackOverFlowException; // adds an element to the stack.
    void pop()throws StackUnderFlowException; //removes an element from the stack.
    T top()throws StackUnderFlowException; // retrieves the last element inserted in the stack.
    boolean isFull();//checks if the stack is full.
    boolean isEmpty();//checks if the stack is empty.

}
