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
}
