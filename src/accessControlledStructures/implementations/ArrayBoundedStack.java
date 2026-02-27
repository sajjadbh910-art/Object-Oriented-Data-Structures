package accessControlledStructures.implementations;

import accessControlledStructures.exceptions.StackOverFlowException;
import accessControlledStructures.exceptions.StackUnderFlowException;
import accessControlledStructures.specifications.StackInterface;

public class ArrayBoundedStack<T> implements StackInterface<T> {


    private final int DFCAP = 100; // default capacity of the array
    private T[] elements;
    private int topIndex;

    //empty params constructor that initializes the Array with a default capacity
       public ArrayBoundedStack(){
           elements = (T[])new Object[DFCAP];
    }

    public ArrayBoundedStack(int numElements){
           elements = (T[])new Object[numElements];
    }

    @Override
    public void push(T element) throws StackOverFlowException {

    }

    @Override
    public void pop() throws StackUnderFlowException {

    }

    @Override
    public T top() throws StackUnderFlowException {
        return null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
