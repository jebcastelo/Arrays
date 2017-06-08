package lmig.com;

public class Queue {
    private int[] vals;
    private int start;
    private int size;
    
    
    public int size() {
    	return size; 
    }

    public void enqueue(int a) {
    	this.vals[this.start + this.size] = a;
    	this.size ++;
    }

    public int dequeue() {
    	this.start ++;
    	this.size --;
    	return this.vals[this.start -1];
    }

    

    public Queue() {

        this.vals = new int[10];

        this.start = 0;

        this.size = 0;

    }

    

    public static void main(String[] args) {
    	
    	Queue myQueue = new Queue();
    	myQueue.enqueue(45);
    	System.out.println(myQueue.size);
    	System.out.println(myQueue.dequeue());

    }



}
