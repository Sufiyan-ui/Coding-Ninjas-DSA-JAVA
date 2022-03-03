package test2;
		// DEQUE
public class Solution2 {
	private int[] data;
    private int front, rear;

	Dequeue(int capacity){
        data = new int[capacity];
        front = -1;
        rear = 0;
    }

boolean isFull(){
    return ((front == 0 && rear == data.length-1) ||
            (front == rear+1));
}

int getFront(){
    if(front == -1)
        return -1;
    
    return data[front];
}

int getRear(){
    if(front == -1)
        return -1;
    
    return data[rear];
}

void insertRear(int val){
    if(isFull()){
        System.out.println(-1);
        return;
    }
    if(front == -1){
        front = 0;
        rear = 0;
    }else if(rear == data.length-1){
        rear = 0;
    }else{
        rear++;
    }
    data[rear] = val;
}

void insertFront(int val){
    if(isFull()){
        System.out.println(-1);
        return;
    }
    if(front == -1){
        front = 0;
        rear = 0;
    }else if(front == 0){
        front = data.length-1;
    }else{
    	front--;
    }
    data[front] = val;
}

void deleteFront(){
    if(front == -1){
        System.out.println(-1);
        return;
    }
    if(front == rear){
        front = -1;
        rear = -1;
    }else{
        if(front == data.length -1)
            front = 0;
        else
            front++;
    }
}

void deleteRear(){
    if(front == -1){
        System.out.println(-1);
        return;
    }
    if (front == rear)
    {
        front = -1;
        rear = -1;
    }
    else if (rear == 0)
        rear = data.length-1;
    else
        rear--;
}
}
