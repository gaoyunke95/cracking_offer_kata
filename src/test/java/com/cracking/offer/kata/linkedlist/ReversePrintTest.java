package com.cracking.offer.kata.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Henry Gao
 * @date 10/27/21 - 9:36 PM
 *
 * These are the unit test cases for LinkedList ReversePrint.
 *
 * 1. basic functionality test
 *      a. only one node
 *      b. multiple nodes
 *
 * 2. special cases
 *      a. null
 */
class ReversePrintTest {

    private ListNode singleNodeLinkedList = new ListNode(1);
    private ListNode mulNodeLinkedList = new ListNode(2);

    private void setUp(){
        ListNode head = mulNodeLinkedList;
        for(int i = 3; i < 6; i++){
            ListNode newNode = new ListNode(i);
            head.next = newNode;
            head = head.next;
        }
    }




    @Test
    void basicSingleNodeLinkedListTest(){
        ReversePrint reversePrint = new ReversePrint();
        assertArrayEquals(new int[]{1}, reversePrint.reversePrint(singleNodeLinkedList));
    }

    @Test
    void basicMulNodeLinkedListTest(){
        ReversePrint reversePrint = new ReversePrint();
        setUp();

        assertArrayEquals(new int[]{5,4,3,2}, reversePrint.reversePrint(mulNodeLinkedList));
    }

    @Test
    void specialCaseTest(){
        ReversePrint reversePrint = new ReversePrint();
        assertArrayEquals(new int[]{}, reversePrint.reversePrint(null));
    }

}