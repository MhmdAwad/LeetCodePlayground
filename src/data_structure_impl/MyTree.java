package data_structure_impl;

class MyTreeNode<T> {
    private T value;
    private MyTreeNode<T> right = null;
    private MyTreeNode<T> left = null;

    public MyTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public MyTreeNode<T> getRight() {
        return right;
    }

    public void setRight(MyTreeNode<T> right) {
        this.right = right;
    }

    public MyTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(MyTreeNode<T> left) {
        this.left = left;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


public class MyTree<T> {

    private MyTreeNode<T> data = null;


    void insert(T value) {
        if (data == null) {
            data = new MyTreeNode<>(value);
            return;
        }
        MyTreeNode<T> startedNode = data;
        MyTreeNode<T> tempNode = new MyTreeNode<>(value);
        while (startedNode != null) {

            if (Double.parseDouble(value.toString()) > Double.parseDouble(startedNode.getValue().toString())) {
                if (startedNode.getRight() == null) {
                    startedNode.setRight(tempNode);
                    return;
                }
                startedNode = startedNode.getRight();
            } else if (Double.parseDouble(value.toString()) < Double.parseDouble(startedNode.getValue().toString())) {
                if (startedNode.getLeft() == null) {
                    startedNode.setLeft(tempNode);
                    return;
                }
                startedNode = startedNode.getLeft();
            } else break;
        }
    }

    private Double convertToDouble(T value){
        return Double.parseDouble(value.toString());
    }

    String lookup(T value){
        MyTreeNode<T> currentNode = data;
        Double doubleValue = convertToDouble(value);
        while (currentNode != null){
            Double nodeValue = convertToDouble(currentNode.getValue());
            if(doubleValue.equals(nodeValue)){
                return "Found";
            }else if(doubleValue > nodeValue){
                currentNode = currentNode.getRight();
            }else if(doubleValue < nodeValue){
                currentNode = currentNode.getLeft();
            }
        }
        return "Not Found";
    }

    void remove(T value){
        if(data == null){
            return;
        }
        if(data.getValue() == value){
            data = null;
            return;
        }
        Double doubleValue = convertToDouble(value);
        MyTreeNode<T> currentNode = data;
        while (currentNode != null){
            Double nodeValue = convertToDouble(currentNode.getValue());
            if(doubleValue > nodeValue){
                currentNode = currentNode.getRight();
            }else if(doubleValue < nodeValue){
                currentNode = currentNode.getLeft();
            }else{

            }
        }
    }

    void print(){
        printTree(data);
    }
    private void printTree(MyTreeNode<T> node) {
        if(node == null)
            return;
        System.out.println(">>>>> "+node.getValue());
        printTree(node.getLeft());
        printTree(node.getRight());
    }


}
