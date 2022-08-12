class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0||n==1)
            return n;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
               
                if(allUniq(s,i,j))
                {
                   ans=Math.max(ans,j-i);
                }
            }
        }
        
        return ans;
    }
    public boolean allUniq(String s,int start,int end)
    {
        Set<Character> set=new HashSet<>();
        for(int k=start;k<end;k++)
                {
                    char ch=s.charAt(k);
                    if(set.contains(ch)) return false;
                    set.add(ch);
        }
        return true;          
    }
}




class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            count=Math.max(count,i-j+1);
            
        }
        return count;
    }
}
