package greedyAlgo;

import java.util.Arrays;

public class Main {
	 public int maxMeetings(int start[], int end[]) {
	        // add your code here
	        int n=start.length;
	        int[][] mat = new int[n][2];
	        for(int i=0;i<n;i++){
	            mat[i][0]=start[i];
	            mat[i][1]=end[i];
	        }
	        
	        Arrays.sort(mat, (a, b) -> {
	            if (a[1] == b[1]) {
	                return a[0] - b[0]; // Tie-breaker: sort by start time
	            } else {
	                return a[1] - b[1]; // Sort by end time
	            }
	        });
	        
	        int ans = 1;
	       int prevEnd = mat[0][1];

	    for (int i = 1; i < n; i++) {
	        if (mat[i][0] > prevEnd) {
	            ans++;
	            prevEnd = mat[i][1];
	        }
	    }
	    

	        return ans;
	    }
}
