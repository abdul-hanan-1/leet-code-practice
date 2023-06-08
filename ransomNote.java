class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> letterFrequency = new HashMap<>();
        for(int i = 0; i<magazine.length(); i++){
            letterFrequency.put(magazine.charAt(i), letterFrequency.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(int j = 0; j<ransomNote.length();j++){
            if(letterFrequency.get(ransomNote.charAt(j)) != null && letterFrequency.get(ransomNote.charAt(j))> 0)
            letterFrequency.put(ransomNote.charAt(j),letterFrequency.get(ransomNote.charAt(j))-1); 
            else
                return false;
        }
        return true;
    }
}
