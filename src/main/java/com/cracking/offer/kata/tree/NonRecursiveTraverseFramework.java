package com.cracking.offer.kata.tree;

/**
 * @author Henry Gao
 * @date 12/3/21 - 8:31 AM
 */

import com.cracking.offer.kata.tree.node.TreeNode;

import java.util.*;

/**
 * These are frameworks for non-recursive traverse for the binary trees.
 *
 * preOrder: root, left, right
 * inOrder: left, root, right
 * postOrder: left, right, root = reverse( root, right, left)
 *
 *  five main lines of code
 *  1. stack.push(root);
 *  2. root = root.left;
 *  3. TreeNode cur = stack.pop();
 *  4. res.add(cur.val);
 *  5. root = cur.right;
 */
public class NonRecursiveTraverseFramework {

    private Deque<TreeNode> stack = new LinkedList<>();
    private List<Integer> res = new ArrayList<>();

    public List<Integer> preOrder(TreeNode root){
        res.clear();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }

            TreeNode cur = stack.pop();
            root = cur.right;
        }
        return res;
    }

    public List<Integer> inOrder(TreeNode root){
        res.clear();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            TreeNode cur = stack.pop();
            res.add(cur.val);
            root = cur.right;
        }
        return res;
    }

    public List<Integer> postOrder(TreeNode root){
        res.clear();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                res.add(root.val);
                stack.push(root);
                root = root.right;
            }
            TreeNode cur = stack.pop();
            root = cur.left;
        }

        Collections.reverse(res);
        return res;
    }
}
