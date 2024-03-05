class Solution {
    public void rotate(int[][] matrix) {
        //This will involve 2 steps doing 
        //1.transpose the matrix
        //2.reverse every row in order to obtain rotated image
        
        trans(matrix);
        rev(matrix);
    }
    
    public void trans(int[][] m){
        for(int i=0;i<m.length;i++){
        for(int j=0;j<i;j++){
            int t=m[i][j];
            m[i][j]=m[j][i];
            m[j][i]=t;
        }
        }
        
    }
    
        
    public void rev(int[][] m){
      for(int i=0;i<m.length;i++){
          int l=0;
          int r=m.length-1;
          while(l<r){
          int t=m[i][l];
          m[i][l]=m[i][r];
          m[i][r]=t;
              l++;
              r--;
          }
      }
    }
}