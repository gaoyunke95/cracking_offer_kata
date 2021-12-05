package com.cracking.offer.kata.tree;

import com.cracking.offer.kata.tree.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Henry Gao
 * @date 12/5/21 - 9:49 AM
 */
public class RecursivePreOrder {

    private List<Integer> res = new ArrayList<>();
    public List<Integer> preOrder(TreeNode root){
        if(root == null){
            return res;
        }
        res.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        return res;
    }

}
