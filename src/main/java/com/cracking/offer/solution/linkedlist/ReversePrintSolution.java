package com.cracking.offer.solution.linkedlist;

import com.cracking.offer.kata.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Henry Gao
 * @date 10/27/21 - 10:45 PM
 */
public class ReversePrintSolution {
    /**
     * use for solution 1
     */
    private Stack<Integer> stack = new Stack<>();
    /**
     * use for solution 2
     */
    private List<Integer> resultList = new ArrayList<>();


    /**
     * this is the solution which uses the stack
     * the time is O(n) , the space is O(n)
     * @param head input LinkedList headnode
     * @return reversePrint array for the LinkedList
     */
    private int[] reversePrintSolutionUsingStack(ListNode head) {
        if(head == null) return new int[]{};

        while(head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] resultArr = new int[size];

        for(int i = 0; i < size; i++){
            resultArr[i] = stack.pop();
        }
        return resultArr;
    }

    /**
     * this is the solution reversePrintRecursively
     * time: O(n) , space O(n)
     * @param head input LinkedList headnode
     * @return reversePrint array for the LinkedList
     */
    private int[] reversePrintRecursively(ListNode head) {

        if(head == null) return new int[]{};

        reversePrintRecursive(head);

        int size = resultList.size();
        int[] resultArr = new int[size];

        for(int i = 0; i < size; i++){
            resultArr[i] = resultList.get(i);
        }

        return resultArr;
    }

    private void reversePrintRecursive(ListNode head){
        if(head == null) return;
        reversePrintRecursive(head.next);
        resultList.add(head.val);
    }
}
