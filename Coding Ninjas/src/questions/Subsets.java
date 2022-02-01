package questions;

//	print subsets of array
public class Subsets {
	public static void printSubsets(int[] ar, int[] output, int sI, int eI) {
		if(sI >= eI) {
			for(int i:output) {
				System.out.print(i);
			}
			System.out.println();
			return;
		}
		printSubsets(ar, output, sI+1, eI);
		output = new int[ar.length-sI];
		int j = 0;
		for(int i=sI; i<ar.length; i++) {
			output[j] = ar[i];
			i++;
		}
		printSubsets(ar, output, sI+1, eI);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3};
		printSubsets(ar, new int[] {}, 0, ar.length-1);
	}

}
