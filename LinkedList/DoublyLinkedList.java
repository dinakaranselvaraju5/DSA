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


    public static Node DeleteHead(Node head){

        if(head == null || head.next == null){
            return null;
        }

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;


        return head;
    }

    public static Node DeleteTail(Node head){

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
       Node prev = temp.back; 
       prev.next = null;
       temp.back = null;


        return head;
    }

    public static Node deleteKthElement(Node head,int k){

        //int k = 3;
        Node temp = head;

        if(temp == null || temp.next == null){
            return null;
        }
        int cnt = 0;
        while(temp!=null){
            cnt++;

            if(cnt == k){
                break;
            }
            temp = temp.next;
        }

        Node prev = temp.back;
        Node front = temp.next;

        if(prev == null && front == null){
            return null;
        }else if(prev == null){
            return DeleteHead (head);
        }else if(front == null){
            return DeleteTail(head);
        }


        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;


        return head;
    }


    public static void DeleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;

        if(front == null){
            prev.next = null;
            temp.back = null;

        }

        prev.next = front;
        front.back = prev;

        temp.next = temp.back = null;

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
        System.out.println();
        //System.out.println("------------ Deleting Head ------------");
        //head = deleteKthElement(head,4);
        DeleteNode(head.next.next.next);
        Print(head);

    }
    
}