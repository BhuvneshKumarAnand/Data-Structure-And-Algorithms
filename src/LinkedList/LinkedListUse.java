package LinkedList;

import java.util.Scanner;

public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;

    }
    public static void increment(Node<Integer> head){
        Node<Integer> temp=head;

        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
    }
    public static int length(Node head){
        //Your code goes here


        Node temp=head;
        int count = 0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }

    public static void printIthNode(Node<Integer> head, int i){
        Node<Integer> temp=head;
        for (int j=0;temp!=null;j++){
            if (j==i){
                System.out.println(temp.data);
                return;
            }else {
                temp=temp.next;
            }
        }
    }
    public static void print(Node<Integer> head){
//        System.out.println(head);
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
//        System.out.println(head.next.next.next.data);
        Node<Integer> temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    //time complexity for below takeInput function is O(N^2)
    static Node<Integer> takeInput() {
        Node<Integer> head=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1){
            Node<Integer> currentNode=new Node<>(data);
            if (head==null){
                head=currentNode;
            }else{
                Node<Integer> tail=head;
                while (tail.next!=null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }
            data=s.nextInt();

        }
        return head;
    }

    //time complexity for below inputLinkList function is O(N)
    //Optimized input Linked List function
    public static Node<Integer> inputLinkList(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null,tail=null;
        while (data!=-1){
            Node<Integer> currentNode=new Node<>(data);
            if (head==null){
                head=currentNode;
                tail=currentNode;
            }else{
                tail.next=currentNode;
                tail=tail.next;
            }

            data=s.nextInt();
        }
        return head;
    }


//        public static void main(String[] args) {
////        Node<Integer> n=new Node<>(120);//object creation
////        System.out.println(n);
////        System.out.println(n.data);
////        System.out.println(n.next);
//
////        Node<Integer> head=createLinkedList();
//////        increment(head);
//////        print(head);
////
////        printIthNode(head,2);
//
//
//
//    }

    public static void main(String[] args) {
        Node<Integer> head=inputLinkList();
        print(head);
    }
}
