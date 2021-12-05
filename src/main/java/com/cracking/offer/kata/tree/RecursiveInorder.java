package com.cracking.offer.kata.tree;

import com.cracking.offer.kata.tree.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Henry Gao
 * @date 12/5/21 - 9:48 AM
 */
public class RecursiveInorder {

    private List<Integer> res = new ArrayList<>();

    public List<Integer> inOrder(TreeNode root){
        if(root == null){
            return res;
        }
        inOrder(root.left);
        res.add(root.val);
        inOrder(root.right);
        return res;
    }
}
