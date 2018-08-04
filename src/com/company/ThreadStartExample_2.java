package com.company;

//RUN vs START
public class ThreadStartExample_2 {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread currentThread = Thread.currentThread();
//                for (int i = 0; i < 10; i++) {
//                    System.out.printf("Printed: %s", );
//                }
                    System.out.printf("Printed: %s\n", currentThread.getName());

                }
        }, "MyThread");

//        t.run();
        t.start();

//        Thread mainThread = Thread.currentThread();
//        System.out.printf("Printed: %s\n", mainThread.getName());

    }
}
