package queues;

public class Solution {

	//	Implementation queue DS using LL
	//Define the data members
    private Node front, rear;
    private int size;


	public Queue() {
		//Implement the Constructor
		front = rear = null;
        size = 0;
    }
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return size == 0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        if(front == null){
            front = rear = new Node(data);
            size++;
            return;
        }
        size++;
        rear.next = new Node(data);
        rear = rear.next;
    }


    public int dequeue() {
    	//Implement the dequeue() function
        if(front == null)
            return -1;
        
        size--;
        int temp = front.data;
        front = front.next;
        return temp;
    }


    public int front() {
    	//Implement the front() function
        return (front == null) ? -1 : front.data;
    }
}
