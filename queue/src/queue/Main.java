package queue;
public class Main{
    public static void main(String[] args) {
        Queue queue = new Queue();
        
        queue.dequeue();
        queue.enqueue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
    
        System.out.println(queue.toString());
    }
    
}