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

    public ArrayCollection(){
        elements = (T[])new Object[DFCAP];
    }

    public ArrayCollection(int capacity){
        elements = (T[])new Object[capacity];
    }



    private void find(T target){

    }
    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public T get() {
        return null;
    }

    @Override
    public boolean contains(T target) {
        return false;
    }

    @Override
    public boolean remove(T target) {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
