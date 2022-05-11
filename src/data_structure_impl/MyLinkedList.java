package data_structure_impl;


public class MyLinkedList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size = 0;


    T getAt(int index) {
        if (index > size)
            throw new NullPointerException();

        int count = 0;
        for (MyNode<T> temp = head; temp != null; temp = temp.getNext()) {
            if (count == index) {
                return temp.getValue();
            }
            count++;
        }
        return null;
    }

    MyNode<T> getNodeAt(int index) {
        if (index > size)
            throw new NullPointerException();

        int count = 0;
        for (MyNode<T> temp = head; temp != null; temp = temp.getNext()) {
            if (count == index) {
                return temp;
            }
            count++;
        }
        return null;
    }


    void printAll() {
        MyNode<T> current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    private void printAllSpecific(MyNode<T> node) {
        MyNode<T> current = node;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    void put(T value) {
        MyNode<T> newNode = new MyNode<>(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    void putHead(T value){
        MyNode<T> newNode = new MyNode<>(value);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    void putAt(T value, int index){

        if(index <= 0){
            putHead(value);
            return;
        }
        if(index > size){
            put(value);
            return;
        }

        MyNode<T> previousNode = getNodeAt(index-1);
        MyNode<T> newNode = new MyNode<>(value);
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
    }

    void removeAt(int index) {
        MyNode<T> selectedNode = getNodeAt(index);
        if (selectedNode != null) {
            MyNode<T> previousNode = getNodeAt(index - 1);
            if (selectedNode.getNext() == null) {
                previousNode.setNext(null);
            } else {
                previousNode.setNext(selectedNode.getNext());
            }
        } else {
            throw new NullPointerException();
        }
    }

    void reverse(){
        MyNode<T> nextNode;
        MyNode<T> previousNode = null;
        MyNode<T> temp = head;
        while (temp != null){
            nextNode = temp.getNext();
            temp.setNext(previousNode);
            previousNode = temp;
            temp = nextNode;
        }
        temp = previousNode;
        printAllSpecific(temp);
    }

    void anotherReverse(){
        MyNode<T> nextNode;
        MyNode<T> previousNode = null;
        MyNode<T> temp = head;
        while (temp != null){
            nextNode = temp.getNext();
            temp.setNext(previousNode);
            previousNode = temp;
            temp = nextNode;
        }
        temp = previousNode;
        printAllSpecific(temp);
    }
}
