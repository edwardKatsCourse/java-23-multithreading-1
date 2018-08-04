package com.company;

public class ThreadJoinExample_4 {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join(500);

        for (int i = 0; i < 200; i++) {
            Thread.sleep(10);
            System.out.println("Main: hello");
        }


    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("MyThread: hello");
        }
    }
}