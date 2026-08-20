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

public class LinkedListTest {

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

    static  int LengthOfLinkedList(Node Head){
     
        int count = 0;
        Node temp = Head;
        while(temp!=null){
             count++;
            temp = temp.next;
        }
        return count;
    }

    public static int CheckIfPresent(Node Head, int val){
        Node temp = Head;
        while(temp != null){
            if(temp.data == val){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    } 

    public static Node RemoveHead(Node Head){
        if(Head == null)
            return Head;
        Head = Head.next;

        return Head;
    }

    public static Node RemoveTail(Node Head){
        if(Head == null || Head.next == null){
            return null;
        }
        Node  temp = Head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return Head;
    }

    public static void Print(Node Head){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
       
    }

    public static void main(String[] args) {
        int[] arr = {30,1,4,11,60};
        Node y = new Node(arr[0]);
        Node Head = ConverArrayToLinkedList(arr);
        //System.out.println(Head.data);
        System.out.println("Print the LinkedList");
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Length of the LinkedList");
        System.out.println(LengthOfLinkedList(Head));
        System.out.println("Check the Number is there or not");
        System.out.println(CheckIfPresent(Head, 60));

        System.out.println("Remove Head ");
         Head = RemoveHead(Head);
        Print(Head);
        System.out.println();
         System.out.println("Remove Tail ");
        Node Tail = RemoveTail(Head);
        Print(Tail);
    }
}