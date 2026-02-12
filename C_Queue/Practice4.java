package C_Queue;

public class Practice4 {
    
    int n=5;
    int []queue=new int[n];
    int front=-1,rear=-1;

    public void enqueue(int value){
        if((rear+1)%n==front){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){
            rear=0;
            front=0;
        }else{
            rear=(rear+1)%n;
        }
        queue[rear]=value;
    }


    public void dequeue(){
        if(front==-1){
            System.out.println("Queue is empty");
        return;
        }
        if(front==rear){
            front=-1;
            rear=-1;

        }else{
            front=(front+1)%n;
        }
    }

    public void display(){
        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }
        int i=front;
        do{
            System.out.print(queue[i]+" ");
            i=(i+1)%n;
        }while(i!=(rear+1)%n);
        System.out.println();
    }

    public static void main(String[] args) {
        Practice4 qu=new Practice4();
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(3);
        qu.enqueue(4);
        qu.enqueue(5);
        System.out.println("Given Queue: ");
        qu.display();
        System.out.println("Queue after partial deletion: ");
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println("Queue after full deletion: ");
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println();
    }
}
