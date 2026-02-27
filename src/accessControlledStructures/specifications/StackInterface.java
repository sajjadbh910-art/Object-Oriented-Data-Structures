package accessControlledStructures.specifications;

public interface StackInterface<T> {

    void push(T element); // adds an element to the stack.
    void pop(); //removes an element from the stack.
    T top(); // retrieves the last element inserted in the stack.
    boolean isFull();//checks if the stack is full.
    boolean isEmpty();//checks if the stack is empty.

}
