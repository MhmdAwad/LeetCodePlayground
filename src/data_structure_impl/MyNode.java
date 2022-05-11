package data_structure_impl;

public class MyNode<T> {
    private final T value;
    private MyNode<T> next = null;

    public MyNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
