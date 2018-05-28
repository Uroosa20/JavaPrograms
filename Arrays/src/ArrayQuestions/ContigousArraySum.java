package ArrayQuestions;

public class ContigousArraySum {
	 public int maxSubArray(final int[] A) {
	        
	        int max_so_far =A[0];
	        int curr_max =A[0];
	        
	        for(int i =1;i<A.length;i++){
	           curr_max = Math.max(A[i], curr_max+ A[i]);
	        max_so_far = Math.max(max_so_far, curr_max);
	            
	        }
	     return max_so_far;
	    }
}
