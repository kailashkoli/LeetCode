class Solution {
    public boolean isPalindrome(String s) {
        //Convert all letters to lowercase
        s = s.toLowerCase();
        //Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (j > i) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}