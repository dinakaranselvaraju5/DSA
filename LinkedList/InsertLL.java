package LinkedList;



class Node{
    int data;
    Node next;

    Node(Node next1, int data1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class InsertLL {

    public static Node ConverArrayToLinkedList(int[] arr){

        Node head = new Node(arr[0]);
        Node Mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            Mover.next = temp;
            Mover = temp;
        }

        return head;

    }


   // Adding New Head to LinkedList
    public static Node InsertHead(Node head,int Val){
        Node temp = new Node(head,Val);
        
        return temp;
    }

    public static Node InsertTail(Node head, int Val){
        if(head == null){
            return new Node(Val);
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newnode = new Node(Val);
        temp.next = newnode;
        return head;
    }

    public static Node InsertPosition(Node head, int val, int k){

        if(head == null){
            if(k == 1){
                return new Node(val);
            }
            else{
                return null;
            }
        }

        if(k == 1){
            return new Node(val, head);
        }

        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            cnt++;
            if(cnt == (k - 1)){
                Node x = new Node (val, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }

        return head;

    }

    public static Node InsertBeforeValue(Node head, int val, int k){

        if(head == null){
            return null;
        }

        if(head.data== k){
            return new Node(val, head);
        }

       
        Node temp = head;
        while(temp.next!=null){
         
            if(temp.next.data == k){
                Node x = new Node (val, temp.next);
                temp.next = x;
                break;
            }
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

    public static void main(String[] args) {
        int[] arr = {78,11,344,221,89};
       
        int val = 800;

        Node Head = ConverArrayToLinkedList(arr);
        Head = InsertBeforeValue(Head, val,78);
        Print(Head);


    }
}