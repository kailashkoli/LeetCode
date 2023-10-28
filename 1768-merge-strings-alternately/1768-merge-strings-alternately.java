class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder text = new StringBuilder();
        int i = 0 ;
        while( i < word1.length() && i < word2.length()){
            text.append(word1.charAt(i));
            text.append(word2.charAt(i));
            i++;
        }
        if(i < word1.length()){
            text.append(word1.substring(i));
        }
        if(i < word2.length()){
            text.append(word2.substring(i));
        }
        return text.toString();
   }
}