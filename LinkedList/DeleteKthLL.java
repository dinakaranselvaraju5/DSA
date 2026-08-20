/*
   Write a Java program to delete the K‑th node from a singly linked list.

   Performed deletion of Head, Position, Value and Last.

*/




package LinkedList;



class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class DeleteKthLL {


    public static Node DeleteKthLinkedList(Node head, int k){

        if(head == null || head.next == null){
            return null;
        }

        if(k == 1){
            return head.next;
        }

        int count = 0;
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            count++;

            if(count == k){
                prev.next= prev.next.next; 
                break;
            }
            prev = temp;
            temp = temp.next;
        }



        return head;
    }


    public static Node DeleteElement(Node head, int k){

        if(head == null || head.next == null){
            return null;
        }

        if(head.data == k){
            return head.next;
        }

        Node temp = head;
        Node prev = null;

        while(temp!=null){

            if(temp.data == k){
                prev.next= prev.next.next; 
                break;
            }
            prev = temp;
            temp = temp.next;
        }



        return head;
    }

    public static void Print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static Node ConverArrayToLinkedList(int[] arr){

        Node Head = new Node(arr[0]);
        Node Mover = Head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            Mover.next = temp;
            Mover = temp;
        }
        return Head;

    }
    public static void main(String[] args) {
        int[] arr = {5,2,6,722,123,1,21,66};
        int k = 2;

        Node head = ConverArrayToLinkedList(arr);
        System.out.println("Delete the Kth Position");
        head = DeleteKthLinkedList(head, k);
        Print(head);
        System.out.println();
        System.out.println("Delete the Kth Value");
        head = DeleteElement(head, k);
        Print(head);
    }
    
}