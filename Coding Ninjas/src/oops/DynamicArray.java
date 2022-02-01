package oops;

public class DynamicArray {
	private int[] data;
	private int nextInd;
	
	public DynamicArray(){
		data = new int[5];
		nextInd = 0;
	}
	
	public void add(int val) {
		while(data.length == nextInd) {
			restructure();
		}
		data[nextInd] = val;
		nextInd++;
	}
	
	public void restructure() {
		int[] temp = data;
		data = new int[data.length*2];
		for(int i=0; i<nextInd; i++) {
			data[i] = temp[i];
		}
	}
	
	public void print() {
		for(int i:data) {
			System.out.print(i+" ");
		}
	}
	
	public DynamicArray add(DynamicArray d) {
		for(int i=0; i<nextInd; i++) {
			if(data[i] > 0 || d.data[i] > 0) {
				this.data[i] += d.data[i];
			}
		}
		return this;
	}
	
	public int size() {
		return nextInd;
	}
}
