package stacks;

public class Solution {
	//	stack using LL
	
	  //Define the data members
    private Node head;
    private int top;


    public Stack() {
        //Implement the Constructor
    	head = null;
        top = -1;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return top+1;
        //Implement the getSize() function
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function)
        return (head == null || top < 0);
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode = new Node(element);
        top++;
            
        if(head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop() {
        //Implement the pop() function
        if(head == null || top < 0)
            return -1;
		
        top--;
        int tmp = head.data;
        head = head.next;
        return tmp;
    }
    
    public int top() {
        //Implement the top() function
        if(top == -1)
            return top;
        return head.data;
    }
}
