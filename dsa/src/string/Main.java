package string;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0||n==1)return n;
        Map<Character,Integer> map = new HashMap<>();
        int res=0;
        int st=0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                st=Math.max(st,map.get(c));
            }

            res=Math.max(res,i-st+1);
            map.put(c,i+1);
        }
        return res;
    }
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0)sb.append(" ");
        }
        return sb.toString();
    }
}
