//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CircularQueueAlgorithm {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;

    public CircularQueueAlgorithm(int size){
        maxSize = size;
        queueArray = new int[maxSize];

        front = -1;
        rear = -1;
    }

    public void enqueue(int item){
        if((rear + 1) % maxSize  == front){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear + 1)%maxSize;
        }
        queueArray[rear] = item;
    }


    public int  deque(){

        int item = -1;
        if(!isEmpty()){
            item = queueArray[front];
            if(front == rear){
                front = -1;
                rear = -1;

            }else{
                front = (front + 1) % maxSize;
            }
        }else{
            System.out.println("Deque is not possible. Array is Empty");
        }

        return item;

    }

    public int peek(){
        if(!isEmpty()){
            return queueArray[front];
        }else{
            System.out.println("Queue is Empty. No Peek Value");
            return -1;
        }
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        CircularQueueAlgorithm circularQueueAlgorithm = new CircularQueueAlgorithm(5);

        circularQueueAlgorithm.enqueue(8);
        circularQueueAlgorithm.enqueue(2);
        circularQueueAlgorithm.enqueue(3);
        circularQueueAlgorithm.enqueue(4);
        circularQueueAlgorithm.enqueue(5);
        circularQueueAlgorithm.enqueue(6);

        System.out.println("Peek Value: " + circularQueueAlgorithm.peek());
        System.out.println("Deque : " + circularQueueAlgorithm.deque());

        System.out.println("Peek after Deque : " + circularQueueAlgorithm.peek());

    }
}