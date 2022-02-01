package questions;

//	print subsets of array
public class Subsets {
	public static int[][] subsets(int input[],int si) {
        if(si>=input.length)
        {
            int ans[][]=new int[1][0];
            return ans;
        }
         
        int[][] smallans=subsets(input,si+1);
        int[][] ans=new int[smallans.length*2][];
        int k=0;
        for(int i=0;i<smallans.length;i++){
            ans[i]=new int[smallans[i].length];
            for(int j=0;j<smallans[i].length;j++){
                ans[i][j]=smallans[i][j];
            }
            k++;
        }
         
        for(int i=0;i<smallans.length;i++){
          ans[k+i]=new int[smallans[i].length+1];
          ans[k+i][0]=input[si];
          for(int j=1;j<=smallans[i].length;j++){
            ans[i+k][j]=smallans[i][j-1];
            }
        }
        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5};
		int[][] array2 = subsets(ar, 0);
		
		for(int[] a: array2) {
			for(int it:a) {
				System.out.print(it+" ");
			}
			System.out.println();
		}
	}

}
