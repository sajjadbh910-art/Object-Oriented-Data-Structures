package collections;

import accessControlledStructures.specifications.CollectionInterface;
/*

implements the Collection Interface using an array

 */
public class ArrayCollection<T> implements CollectionInterface<T> {

    private final int DFCAP = 100;
    private T[] elements;
    private boolean isFound;
    private int numElements;
    private int location;

    public ArrayCollection(){
        elements = (T[])new Object[DFCAP];
    }

    public ArrayCollection(int capacity){
        elements = (T[])new Object[capacity];
    }


    private void find(T target){
        location = 0;
        isFound = false;

        while(location < elements.length){
            if(elements[location] == target){
                isFound = true;
                return;
            }else{
             location++;
            }
        }
    }

    @Override
    public boolean add(T element) {
        if(!isFull()) {
            elements[numElements] = element;
            numElements++;
            return true;
        }

        return false;
    }

    @Override
    public T get(T target) {
        find(target);

        if(isFound){
            return elements[location];
        }
        return null;
    }

    @Override
    public boolean contains(T target) {
        find(target);
        return isFound;
    }

    @Override
    public boolean remove(T target) {
        find(target);

        if(isFound){
            elements[location] = elements[numElements - 1];
            elements[numElements - 1] = null;
            numElements--;
        }
        return isFound;
    }

    @Override
    public boolean isFull() {
        return numElements == elements.length;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public int size() {
        return numElements;
    }
}
