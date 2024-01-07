class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        for(int i=0 ; i<word1.length ; i++){
            sb1.append(word1[i]);
            }
        for(int j=0 ; j<word2.length ; j++){
            sb2.append(word2[j]);
            }
        String str1=sb1.toString();
        String str2=sb2.toString();
        if(str1.equals(str2)){
            return true ;
        }
        return false;

    }
}