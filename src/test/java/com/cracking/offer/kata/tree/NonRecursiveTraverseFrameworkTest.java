package com.cracking.offer.kata.tree;

import com.cracking.offer.kata.tree.node.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;


/**
 * @author Henry Gao
 * @date 12/5/21 - 10:01 AM
 *
 * These are the unit test cases for the NonRecursiveTraverse of binary Tree
 *
 * 1. basic functionality test
 *      a. tree contains both left and right subtrees
 *      b. tree contains only left subtree
 *      c. tree contains only right subtree;
 *      d. tree contains no left and right subtree;
 * 2. special case
 *      a. tree contains no elements ( null tree)
 */
class NonRecursiveTraverseFrameworkTest {

    private NonRecursiveTraverseFramework frameworkTestInstance = new NonRecursiveTraverseFramework();

    @Test
    void treeContainsBothSubTreeForPreOrderTest(){
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(19);

        List<Integer> expected = new ArrayList<>();
        expected.add(11);
        expected.add(5);
        expected.add(2);
        expected.add(8);
        expected.add(15);
        expected.add(12);
        expected.add(19);

        List<Integer> res = frameworkTestInstance.preOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsBothSubTreeForInOrderTest(){
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(19);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        expected.add(8);
        expected.add(11);
        expected.add(12);
        expected.add(15);
        expected.add(19);

        List<Integer> res = frameworkTestInstance.inOrder(root);
        assertIterableEquals(expected,res);

    }

    @Test
    void treeContainsBothSubTreeForPostOrderTest(){
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(19);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(8);
        expected.add(5);
        expected.add(12);
        expected.add(19);
        expected.add(15);
        expected.add(11);

        List<Integer> res = frameworkTestInstance.postOrder(root);
        assertIterableEquals(expected,res);

    }

    @Test
    void treeContainsOnlyLeftSubTreeForPreOrderTest(){
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        expected.add(11);

        List<Integer> res = frameworkTestInstance.postOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsOnlyLeftSubTreeForInOrderTest(){
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        expected.add(11);

        List<Integer> res = frameworkTestInstance.postOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsOnlyLeftSubTreeForPostOrderTest(){
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        expected.add(11);

        List<Integer> res = frameworkTestInstance.postOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsOnlyRightSubTreeForPreOrderTest(){
        TreeNode root = new TreeNode(11);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(11);
        expected.add(5);
        expected.add(2);

        List<Integer> res = frameworkTestInstance.preOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsOnlyRightSubTreeForInOrderTest(){
        TreeNode root = new TreeNode(11);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(11);
        expected.add(5);
        expected.add(2);

        List<Integer> res = frameworkTestInstance.inOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsOnlyRightSubTreeForPostOrderTest(){
        TreeNode root = new TreeNode(11);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        expected.add(11);

        List<Integer> res = frameworkTestInstance.postOrder(root);
        assertIterableEquals(expected,res);
    }


    @Test
    void treeContainsNoSubTreeForPreOrderTest(){
        TreeNode root = new TreeNode(11);

        List<Integer> expected = new ArrayList<>();
        expected.add(11);

        List<Integer> res = frameworkTestInstance.preOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsNoSubTreeForInOrderTest(){
        TreeNode root = new TreeNode(11);

        List<Integer> expected = new ArrayList<>();

        expected.add(11);

        List<Integer> res = frameworkTestInstance.inOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsNoSubTreeForPostOrderTest(){
        TreeNode root = new TreeNode(11);
        List<Integer> expected = new ArrayList<>();

        expected.add(11);

        List<Integer> res = frameworkTestInstance.postOrder(root);
        assertIterableEquals(expected,res);
    }


    @Test
    void nullTreeForAllTraversalsTest(){
        List<Integer> expected = new ArrayList<>();

        List<Integer> preOrderRes = frameworkTestInstance.preOrder(null);
        List<Integer> inOrderRes = frameworkTestInstance.inOrder(null);
        List<Integer> postOrderRes = frameworkTestInstance.postOrder(null);

        assertIterableEquals(expected,preOrderRes);
        assertIterableEquals(expected,inOrderRes);
        assertIterableEquals(expected,postOrderRes);

    }


}