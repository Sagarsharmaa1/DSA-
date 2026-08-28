class Solution {

    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i > j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }

            }
        }

        int si = 0;
        int ei = matrix[0].length-1;

        while(si <= ei){
            for(int i=0;i<matrix.length;i++){
                int temp = matrix[i][si];
                matrix[i][si] = matrix[i][ei];
                matrix[i][ei] = temp;
            }
            si++;
            ei--;
        }
      
    }
}