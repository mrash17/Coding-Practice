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
