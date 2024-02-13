class Solution {
    public String firstPalindrome(String[] words) {
        String wrd=new String();
        String wrd1="";
        int p =words.length;

        for(int i=0 ; i<p ; i++){
            wrd=words[i];
        StringBuilder sc= new StringBuilder(words[i]);
        sc.reverse();
        String sc1=sc.toString();

        if(wrd.equals(sc1)){
            return wrd;
        }

        

        }
           return wrd1; 
    }
}