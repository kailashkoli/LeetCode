class Solution {
    public String restoreString(String s, int[] indices) {
        String a="";
        char temp[]=new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
          temp[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<temp.length;i++)
        {
          a+=temp[i];
        }
        return a;
    }
}