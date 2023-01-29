public class Node {
    int data;
    Node next;

    Node(){}
}

class Queue{
    Node front = null;
    Node rear = null;

    Queue(){}

    boolean isEmpty(){
        return this.front==null;
    }
    void enqueue(int d){
        Node n = new Node();
        n.data=d;
        n.next=null;
        if (this.isEmpty()){
            this.front=n;
        }
        else {
            this.rear.next=n;
        }
        this.rear=n;
        System.out.println(d+"has been enqueued in the queue");
    }
       int dequeue(){
         int d = this.front.data;
         if (this.isEmpty()){
             System.out.println("Queue is Empty");
             return -1;
         }
         else{
             if (this.front.next==null){
                 this.rear=null;
             }
             this.front=this.front.next;
             System.out.println(d+ "has been dequeued");
             return d;
         }
       }

       void display(){
        for(Node temp=this.front; temp!=null; temp=temp.next){
            System.out.println(temp.data+ "-->");
        }
       }
}

class main{
    public static void main(String[] args) {
        Queue q =new Queue();
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.dequeue();
        q.display();
    }
}


