package LinkedList;
class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //implementation of beginning of ll
    public void beginLL(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
     //implementation of ending of ll
    public void atLastLL(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    //insertion after any node
    public void afterNode(int data,int nodedata){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int f=0;
        while(temp!=null){
            if(temp.data!=nodedata){
                temp=temp.next;
            }else{
                f=1;
                break;
            }
        }
        if(f==1){
        if(temp.next!=null){
            newNode.next=temp.next;
            temp.next=newNode;
            return;
        }else{
            temp.next=newNode;
            return;
        }
    }else{
        System.out.println("element not found thats why no insertion");
    }
   
        

    }
    //printing LL
    public void displayLL(){
        Node temp=head;
        if(head==null){
            System.out.println("linked list is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"    ");
            temp=temp.next;
        }
    }
     //key is present in LL
    public boolean isKeyPresent(int x){
        Node temp=head;
        boolean b=false;
        while(temp!=null){
            if(temp.data==x){
                b=true;
                return b;
            }else{
                temp=temp.next;
            }
        }
        return b;
    } 
    public void removeDuplicates()
    {
        /*Another reference to head*/
        Node curr = head;
 
        /* Traverse list till the last node */
        while (curr != null) {
            Node temp = curr;
            /*Compare current node with the next node and
            keep on deleting them until it matches the
            current node data */
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
    }
    
}

public class Singly {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.beginLL(20);
        ll.beginLL(20);
        ll.beginLL(20);
        ll.beginLL(10);
        ll.atLastLL(21);
        ll.afterNode(33, 20);
        ll.afterNode(34, 21);
        //ll.afterNode(35, 102);
        //System.out.println(ll.isKeyPresent(103));
        ll.displayLL();
        System.out.println();
        ll.removeDuplicates();
        ll.displayLL();
        
        
    }
}
