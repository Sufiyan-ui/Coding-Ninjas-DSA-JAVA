package oops;

public class Main{

	public static void main(String[] args) {
//		Fraction f = new Fraction(5,20);
//		f.print();
		// 1/4
		
//		Fraction f2 = f.add(2,3);
//		f2.print();
		// 11/12
		
//		Fraction f3 = f2.sub(1,3);
//		f3.print();
		// 7/12
		
//		Fraction f4 = new Fraction(25,100);
//		f4.print();
		// 1/4	
		
		DynamicArray da = new DynamicArray();
		for(int i=0; i<20; i++) {
			da.add(i+1);
		}

		da.print();
		System.out.println();
//		System.out.println("size of array: "+da.size());
		
		DynamicArray db = new DynamicArray();
		for(int i=0; i<20; i++) {
			db.add(i-1);
		}
		
		db.print();
		
		System.out.println();
		
		da.add(db);
		System.out.println();
		da.print();
	}
}
