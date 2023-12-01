package queue;

public class Queue{
    Node top, back; int size;
    public Queue(){
        this.top = null;
        this.back = null;
        this.size = 0;
    }

    
    public int size(){
        return this.size;
    }


    public void enqueue(Object element){
        Node node = new Node(element);
        if (size() == 0){
            this.top = node;
            this.back = node;
        }else{
            this.back.next = node;
            this.back = node;
        }
        this.size += 1;
    }


    public void dequeue(){
        try {
            if(size() == 0){
                System.out.println("Empty queue");
            }
            this.top = this.top.next;
            this.size -= 1;
            
        } catch (NullPointerException e) {
            System.out.println("Fila vazia");
        }
    }
    public String toString(){
        StringBuilder string = new StringBuilder();
        if (size() == 0){
            return "Empty queue";
        }
        Node actual = this.top;
        while(actual != null){
            string.append(actual.data + "\n");
            actual = actual.next;
        }
        return string.toString();
    }
    }