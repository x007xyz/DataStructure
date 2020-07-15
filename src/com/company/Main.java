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
        /*ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);*/
//        int opCount = 100000;
//        LoopQueue<Integer> loopQueue = new LoopQueue<>();
//        double time1 = testQueue(loopQueue, opCount);
//        System.out.println("LoopQueue, time: " + time1 + " s");
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        double time2 = testQueue(arrayQueue, opCount);
//        System.out.println("ArrayQueue, time: " + time2 + " s");
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i, i);
        }
        linkedList.remove(2);
        System.out.println(linkedList);
    }
}
