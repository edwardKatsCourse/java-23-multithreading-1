package com.company;

public class CountOperations_3 {
    public static void main(String[] args) throws InterruptedException {

        CounterThread counterThread = new CounterThread("Counter thread");
        counterThread.start();

        //counterThread.join() - подождать, пока thread закончит работу
        //join блокирует работу main треда, пока counterThread не закончит полностью свою работу
        counterThread.join();

        Thread mainThread = Thread.currentThread();
        for (int i = 0; i < 6; i++) {
            System.out.println(mainThread.getName() + ": " + i);
        }

    }
}

//extends Thread вызвать .start() напрямую
//implements Runnable нужно создать new Thread, чтобы запустить
class CounterThread extends Thread {

    public CounterThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 6; i++) {
            System.out.println(currentThread.getName() + ": " + i);
        }
    }
}