package com.cracking.offer.solution.array;

/**
 * @author Henry Gao
 * @date 10/21/21 - 10:01 PM
 */
public class SearchMatrix240Solution {
    /**
     * O(n^2) solution
     * this is not a recommended solution, since the question is asking for an efficient algorithm
     *
     * @param matrix a 2d array
     * @param target target value
     * @return true if 2d array contains the target value, false for no
     */
    private static boolean searchMatrixNP2Solution(int[][] matrix, int target){

        if(matrix == null || matrix.length == 0) return false;

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        for(int row = 0; row < rowLen; row++) {
            for(int col = 0; col < colLen; col++) {
                if(matrix[row][col] == target) return true;
            }
        }

        return false;
    }

    /**
     * Time: O(M+N) & Space: O(1) solution
     * this is a recommended solution,
     *
     * @param matrix a 2d array
     * @param target target value
     * @return true if 2d array contains the target value, false for no
     */
    private static boolean searchMatrixOMNSolution(int[][] matrix, int target){

        if(matrix == null || matrix.length == 0) return false;

        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(target == matrix[row][col]) return true;
            if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }

        return false;
    }


}
