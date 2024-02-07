class Solution {
    public int[][] generateMatrix(int n) {
        int rowMin = 0,
            rowMax = n - 1,
            colMin = 0,
            colMax = n - 1;
        int cnt = 1;
        int matrix[][] = new int[n][n];
        while(rowMin <= rowMax && colMin <= colMax){
            for(int i = colMin ; i <= colMax ; i++){
                System.out.println(cnt);
                matrix[rowMin][i] = cnt++;
            }
            
            rowMin++;
            
            
            for(int j = rowMin ; j <= colMax ; j++){
                System.out.println(cnt);
                matrix[j][colMax] = cnt++;
            }
            
            colMax--;
            
            for(int k = colMax ; k >= colMin ; k--){
                System.out.println(cnt);
                matrix[rowMax][k] = cnt++;
            }
            rowMax--;
            
            for(int q = rowMax ; q >= rowMin ; q--){
                System.out.println(cnt);
                matrix[q][colMin] = cnt++;
            }
            colMin++;

        }
        
        return matrix;
    }
}