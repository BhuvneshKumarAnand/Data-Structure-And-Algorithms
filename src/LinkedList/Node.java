package LinkedList;

public class Node<T> {
    T data;
    Node<T> next;//reference

    Node(T data){
        this.data=data;
        next=null;
    }

}
