package C_Queue;

public class Practice5 {
    
    static class Node{
        int data;
        Node next;
        Node(int item){
            this.data=item;
            this.next=null;
        }
    }

    Node front=null,rear=null;

    public void enqueue(int value){
        Node newNode=new Node(value);
        if(front==null){
            rear=newNode;
            front=newNode;
            rear.next=front;
        }else{
            rear.next=newNode;
            rear=newNode;
            rear.next=front;
        }
    }
    public void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        if(front==rear){
            front=null;
            rear=null;
        }else{
            front=front.next;
            rear.next=front;
        }
    }

    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        Node ptr=front;
        do{
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }while(ptr!=front);
        System.out.println();
    }

    public static void main(String[] args) {
        Practice5 qu=new Practice5();
        qu.enqueue(12);
        qu.enqueue(2);
        qu.enqueue(3);
        qu.enqueue(5);
        System.out.println("Given QUeue");
        qu.display();
        System.out.println("Queue after partial deltion: ");
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println("queue after full deltion");
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.display();
        
    }
}
