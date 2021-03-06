package priorityQueue_2;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

	public static void findMedian(int arr[]) {
		PriorityQueue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
 		PriorityQueue<Integer> minpq=new PriorityQueue<>();
        int i=0;
        while(i<arr.length){
            // the below if condition is for the first element to enter in the max priority queue
            
            if(maxpq.size()==0&&minpq.size()==0){
                maxpq.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
            // the below condition is for second element to enter to the min priority queue
            
            else if(maxpq.size()!=0&&minpq.size()==0){
                maxpq.add(arr[i]);
                minpq.add(maxpq.remove());
                int max=maxpq.peek();
                int min=minpq.peek();
                System.out.print((max+min)/2+" ");
            }
            // when both have elements
            else if(maxpq.size()!=0&&minpq.size()!=0){
                int num=arr[i];
                int max=maxpq.peek();
                int min=minpq.peek();
                if(num<max){
                maxpq.add(arr[i]);           
                }else{
                    minpq.add(arr[i]);
                } max=maxpq.peek();
                 min=minpq.peek();
                // if the size is same
                if(maxpq.size()==minpq.size()){
                    System.out.print((maxpq.peek()+minpq.peek())/2+" ");
                }
                // if the size is differ more than one than 
                // first try to make there size equal 
                else if(maxpq.size()-minpq.size()>1){
                    minpq.add(maxpq.remove());
                    max=maxpq.peek();
                    min=minpq.peek();
                    System.out.print((max+min)/2+" ");
                }//same
                else if(minpq.size()-maxpq.size()>1){
                     maxpq.add(minpq.remove());
                     max=maxpq.peek();
                     min=minpq.peek();
                     System.out.print((max+min)/2+" ");
                }   // if difference is less than two mwans one    
                else if(minpq.size()>maxpq.size()){
                     System.out.print(minpq.peek()+" ");
                }
                else if(minpq.size()<maxpq.size()){
                     System.out.print(maxpq.peek()+" ");
                }
            }
        i++;
        }
    }
}
