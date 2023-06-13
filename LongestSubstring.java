class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSbstr = 0;
        String temp = "";
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ;i<s.length();i++){
            if(temp.contains(String.valueOf(s.charAt(i)))){
                if(longestSbstr < (end - start))
                    longestSbstr = end - start;
                start++;
                i = start-1;
                end = start;
                temp = "";

            }
            else{
                end++;
                temp = temp + s.charAt(i);
            }

        }
        if((end - start)>longestSbstr)
            longestSbstr = end - start;
        return longestSbstr;
    }
}

// better approach 

//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int longestSbstr = 0;
//        int start = 0;
//        int end = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (map.containsKey(c)) {
//                start = Math.max(start, map.get(c) + 1);
//            }
//
//            map.put(c, i);
//            end = i + 1;
//
//            longestSbstr = Math.max(longestSbstr, end - start);
//        }
//
//        return longestSbstr;
//    }
//}

