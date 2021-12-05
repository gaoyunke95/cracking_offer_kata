package com.cracking.offer.kata.tree;

import com.cracking.offer.kata.tree.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Henry Gao
 * @date 12/5/21 - 9:49 AM
 */
public class RecursivePostOrder {

   private List<Integer> res = new ArrayList<>();

   public List<Integer> postOrder(TreeNode root){

       if(root == null) return res;

       postOrder(root.left);
       postOrder(root.right);
       res.add(root.val);

       return res;
   }


}
