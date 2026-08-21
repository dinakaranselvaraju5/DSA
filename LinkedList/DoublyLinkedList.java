package LinkedList;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}



public class DoublyLinkedList {

    public static Node ConvertDoublyLinkedList2Array(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
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


    public static void main(String[] args) {
        int[] arr = {3,12,44,211,1231};
        Node head = ConvertDoublyLinkedList2Array(arr);
        Print(head);

    }
    
}