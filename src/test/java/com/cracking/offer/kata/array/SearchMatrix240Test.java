package com.cracking.offer.kata.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




/**
 * @author Henry Gao
 * @date 10/21/21 - 9:26 PM
 *
 * *unit test cases should be written before doing actual implementation.
 *
 * this is the unit test cases for the SearchMatrix240.
 *
 * 1. basic functionality test:
 *      a. contains the target value:
 *          - the target value is the maxvalue in the matrix
 *          - the target value is the minvalue in the matrix
 *          - the target value is in between maxvalue and minvalue of the matrix
 *      b. doesn't contain the target value:
 *          - the target value is greater than the maxvalue in the matrix
 *          - the target value is smaller than the minvalue in the matrix
 *          - the target value is in between maxvalue and minvalue of the matrix
 *
 * 2. special case: NULL target value
 *
 * 3. test for singleRowMatrix
 *
 * 4. special matrix cases:
 *      a. null matrix
 *      b. empty matrix
 *
 *
 */
class SearchMatrix240Test {

    private int[][] matrix = new int[][]{{1,4,7,11,15}, {2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    private int[][] singleRowMatrix = new int[][]{{1,4,7,11,15}};

    /**
     * testing basic functionality 1a
     */
    @Test
    void containsTheTargetValue(){
        assertAll(() -> Assertions.assertTrue(SearchMatrix240.searchMatrix(matrix, 1)),
                () -> Assertions.assertTrue(SearchMatrix240.searchMatrix(matrix, 7)),
                () -> Assertions.assertTrue(SearchMatrix240.searchMatrix(matrix, 30)));
    }

    /**
     * testing basic functionality 1b
     */
    @Test
    void doesNotContainTheTargetValue(){
        assertAll(() -> Assertions.assertFalse(SearchMatrix240.searchMatrix(matrix, 0)),
                () -> Assertions.assertFalse(SearchMatrix240.searchMatrix(matrix, 20)),
                () -> Assertions.assertFalse(SearchMatrix240.searchMatrix(matrix, 31)));
    }

/*  for the null specialCaseTest might need convert the second argument type of the searchMatrix method to Integer
    @Test
    void specialCaseNullTest(){
        assertFalse(searchMatrix(matrix, null));
    }*/

    /**
     * test for singleRow Matrix
     */
    @Test
    void withSingleRowMatrix(){
        assertAll(() -> Assertions.assertTrue(SearchMatrix240.searchMatrix(singleRowMatrix, 1)),
                () -> Assertions.assertTrue(SearchMatrix240.searchMatrix(singleRowMatrix, 4)),
                () -> Assertions.assertTrue(SearchMatrix240.searchMatrix(singleRowMatrix, 15)));

        assertAll(() -> Assertions.assertFalse(SearchMatrix240.searchMatrix(singleRowMatrix, 0)),
                () -> Assertions.assertFalse(SearchMatrix240.searchMatrix(singleRowMatrix, 8)),
                () -> Assertions.assertFalse(SearchMatrix240.searchMatrix(singleRowMatrix, 31)));
    }

    /**
     * test for special Matrix
     */
    @Test
    void specialMatrixTest(){
        assertFalse(SearchMatrix240.searchMatrix(null, 1));
        assertFalse(SearchMatrix240.searchMatrix(new int[][]{}, 1));
    }
}