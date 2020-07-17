package com.company;

import java.util.Random;

public class Main {

    private static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
	// write your code here
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num: nums) {
            bst.add(num);
        }
//        bst.levelOrder();
        System.out.println(bst);
        bst.remove(3);
        System.out.println();
        System.out.println(bst);
//        bst.preOrderNR();
//        System.out.println(bst);
    }
}
