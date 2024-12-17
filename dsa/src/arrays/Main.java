package arrays;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x= target-nums[i];
            if(map.containsKey(x)){
                ans[0]=map.get(x);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }

    public int[] repeatedNumber(final int[] A) {
        
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        
        for(int i:A){
            int v=0;
            if(map.containsKey(i)){
                v=map.get(i);
            }            
            map.put(i,v+1);
        }
        int n=A.length;
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                res[1]=i;
            }else {
                int x=map.get(i);
            if(x==2){
                res[0]=i;
            }
            }
            
        }
        
        return res;
    }
}
