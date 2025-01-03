package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 4) return ans;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicates

                int l = j + 1, r = n - 1;
                while (l < r) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[l];
                    sum += nums[r];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        
                        // Skip duplicates
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return ans;
    }
public int addDigits(int num) {
        while(num>9){
            num=addDigits(sum(num));
        }
        return num;
    }
    public int sum(int n){
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
