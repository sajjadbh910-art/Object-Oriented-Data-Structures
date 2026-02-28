package accessControlledStructures.specifications;

/*
a collection for a class that implements a collection of T
it allows addition, removal, and retrieval of elements such that
an element.equals(target);
 */
public interface CollectionInterface<T> {

    boolean add(T element);
    T get();
    boolean contains(T target);
    boolean remove(T target);
    boolean isFull();
    boolean isEmpty();
    int size();

}
