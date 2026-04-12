class Solution {
    public boolean areSimilar(int[][] mat, int k) {

        int row = mat.length;
        int col = mat[0].length;

        k = k % col;

        if(k == 0) return true;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                int newCol;

                if(i % 2 == 0){
                    // even row → left shift
                    newCol = (j + k) % col;
                } else {
                    // odd row → right shift
                    newCol = (j - k + col) % col;
                }

                if(mat[i][j] != mat[i][newCol]){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String [] args){
        Solution sol = new Solution();
    }
}