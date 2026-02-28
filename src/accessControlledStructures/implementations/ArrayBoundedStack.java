package accessControlledStructures.implementations;

import accessControlledStructures.exceptions.StackOverFlowException;
import accessControlledStructures.exceptions.StackUnderFlowException;
import accessControlledStructures.specifications.StackInterface;

public class ArrayBoundedStack<T> implements StackInterface<T> {


    private final int DFCAP = 100; // default capacity of the array
    private T[] elements;
    private int topIndex = -1; // keeps track of the top index in the stack

    //empty params constructor that initializes the Array with a default capacity
       public ArrayBoundedStack(){
           elements = (T[])new Object[DFCAP];
    }

    public ArrayBoundedStack(int numElements){
           elements = (T[])new Object[numElements];
    }

    @Override
    public void push(T element) throws StackOverFlowException {
           if(isFull())
               throw new StackOverFlowException("push is attempted on a full stack");
           else {
               topIndex++;
               elements[topIndex] = element;
           }

    }

    @Override
    public void pop() throws StackUnderFlowException {

           if(isEmpty()){
               throw new StackUnderFlowException("pop is attempted on an empty stack");
           }else {
               elements[topIndex] = null;
               topIndex--;
           }
    }

    @Override
    public T top(){
        return elements[topIndex];
    }

    @Override
    public boolean isFull() {
        return topIndex == elements.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

}
