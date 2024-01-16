package LinkedList;

import java.util.Scanner;

import static LinkedList.LinkedListUse.print;

public class LinkedListUse2 {

//    public static Node<Integer> takeInput(){
//        Scanner s=new Scanner(System.in);
//        int data=s.nextInt();
//        Node<Integer> head=null;//this is not the node but the reference with the value null as we didn't use new keyword
//        while(data!=-1){
//            Node<Integer> currentNode=new Node<>(data);
//            if (head==null){
//                //Make this node as head Node
//                head=currentNode;
//            }else{
//                Node<Integer> tail=head;
//                while(tail.next!=null){
//                    tail=tail.next;
//                }
//                //tail will refer to last node
//                //connect the current node to last node
//                tail.next=currentNode;
//            }
//            data=s.nextInt();
//        }
//
//        return head;
//    }


    //time complexity for below takeInput function is O(N^2)
    private static Node<Integer> takeInput() {
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

    //Delete Node In LL
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        // Write your code here.
        if(head==null){
            return null;
        }
        if(pos==1){
            return head.next;
        }
        Node<Integer> prev=head;
        int count=0;
        while(count<pos-1 && prev!=null){
            prev=prev.next;
            count++;

        }
        if(prev!=null&& prev.next!=null){
            prev.next=prev.next.next;
//            return head;
        }
//        if (prev.next==null){
//            return head;
//        }else{
//            prev.next=prev.next.next;
//            return prev;
//
//        }
        return head;

    }



    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        Node<Integer> h= deleteNode(head,4);
        print(h);

    }


}
