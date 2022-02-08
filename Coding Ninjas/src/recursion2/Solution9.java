package recursion2;

public class Solution9 {
	// Print subsets sum equal to k
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
		printSubsets(input, new int[] {}, 0, k);
	}
        
    public static void printSubsets(int input[], int[] output, int sI,int k) {
        if(sI >= input.length){
            int sum = k;
            for(int i:output){
                sum-=i;
            }
        	if(sum == 0){
            	for(int i:output){
                System.out.print(i+" ");
            	}
            	System.out.println();
        	}
            return;
        }
        printSubsets(input, output, sI+1, k);
        
        int[] temp = output;
        output = new int[temp.length+1];
        for(int i=0; i<temp.length; i++){
            output[i] = temp[i];
        }
        
        for(int i=temp.length; i<output.length; i++){
            output[i] = input[sI];
        }
        printSubsets(input, output, sI+1, k);
	}
}
