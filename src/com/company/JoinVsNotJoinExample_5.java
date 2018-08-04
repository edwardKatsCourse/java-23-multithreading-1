package com.company;

import java.util.ArrayList;
import java.util.List;

public class JoinVsNotJoinExample_5 {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            threads.add(new Thread(new XRunnable(), "T" + (i+1))); //T1, T2 ...
        }

        for (Thread t : threads) {
            t.start();
//            t.join();
        }



        for (Thread t : threads) {
            //threads.get(0) -> ждем его
            //threads.get(1) -> потом его
            //threads.get(2) -> потом его
            //..и т.д.

//            t.join();
        }


    }
}

class XRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }

    }
}