package com.cracking.offer.kata.tree;

import com.cracking.offer.kata.tree.node.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Henry Gao
 * @date 12/5/21 - 4:59 PM
 */
class RecursiveInorderTest {

    @Test
    void treeContainsBothSubTreeForInOrderTest(){
        RecursiveInorder testInstance = new RecursiveInorder();

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

        List<Integer> res = testInstance.inOrder(root);
        assertIterableEquals(expected,res);

    }

    @Test
    void treeContainsOnlyLeftSubTreeForInOrderTest(){
        RecursiveInorder testInstance = new RecursiveInorder();

        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        expected.add(11);

        List<Integer> res = testInstance.inOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void treeContainsOnlyRightSubTreeForInOrderTest(){
        RecursiveInorder testInstance = new RecursiveInorder();

        TreeNode root = new TreeNode(11);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(11);
        expected.add(5);
        expected.add(2);

        List<Integer> res = testInstance.inOrder(root);
        assertIterableEquals(expected,res);
    }

    @Test
    void nullTreeForAllTraversalsTest(){
        RecursiveInorder testInstance = new RecursiveInorder();

        List<Integer> expected = new ArrayList<>();


        List<Integer> inOrderRes = testInstance.inOrder(null);

        assertIterableEquals(expected,inOrderRes);

    }

}