package recursion2;

public class Solution7 {
	// Print Subsets (Arrays)
	public static void printSubsets(int input[]) {
		// Write your code here
        printSubsets(input, new int[] {}, 0);
	}
	public static void printSubsets(int input[], int[] output, int sI) {
        if(sI >= input.length){
            for(int i:output){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        printSubsets(input, output, sI+1);
        
        int[] temp = output;
        output = new int[temp.length+1];
        for(int i=0; i<temp.length; i++){
            output[i] = temp[i];
        }
        
        for(int i=temp.length; i<output.length; i++){
            output[i] = input[sI];
        }
        printSubsets(input, output, sI+1);
	}
}
