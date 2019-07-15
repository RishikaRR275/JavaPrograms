package javaIncAssg6;

public class Node<T> {
    public T data;
    Node next;
    Node(T data){
        this.data = data;
        next = null;
    }
}
