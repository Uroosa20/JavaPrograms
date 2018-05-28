package ArrayQuestions;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public int[] plusOne(int[] A) {
        int carry = 1;
    int[] result = new int[A.length];
    for (int i = A.length - 1; i >= 0; i--) {
        int val = A[i] + carry;
        result[i] = val % 10;
        carry = val / 10;
    }
    if (carry == 1) {
        result = new int[A.length + 1];
        result[0] = 1;
    }
    int index=0;
    int count =0;
    
      while(result[index]==0 && index < result.length -1){
             count++;
             for(int i=index ; i< result.length-1;i++){
             result[i] = result[i+1];
             }
             
        }
     
      int[] a = new int[result.length - count];
      System.arraycopy(result, 0, a, 0, a.length);
      return a;
	}
   
    
	
   
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] res=sol.plusOne(new int[]{0, 0, 4, 4, 6, 0, 9, 6, 5, 1 });
		System.out.println(Arrays.toString(res));
	}
}
