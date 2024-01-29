class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {    int[][] output = new int[m][n];
        int row = 0;
        int col = 0;
        
        if((m * n) != original.length) return new int[0][0];
            
            for(int j = 0; j < original.length; j++) {
                
                output[row][col] = original[j];
                col++;
                
                if(col == n){
                  
                    col = 0;
                    row++;
                } 
            }
        
        return output;
        
    }
}