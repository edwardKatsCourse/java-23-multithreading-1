package com.company;

public class CPUPredictionExample_1 {
    //class - запускает работу и следит за ходом выполнения
    //java.lang.Thread

    //Interfaces - что нужно "параллелить" (работа, которую нужно выполнить асинхронно)
    //java.lang.Runnable                    - void
    //java.lang.Callable (from Java 1.5)    - может возвращать результат метода

    public static void main(String[] args) {

        //Thread + Runnable


//        Thread thread_1 = new Thread();
//        Thread thread_2 = new Thread();
//        thread_1.start();
//        thread_2.start();

        //sync vs async
        //synchronized - последовательно
        //asynchronous - одновременно



//        method();



        Thread myRunnableThread = new Thread(new MyRunnable());
//        myRunnableThread.run();
        myRunnableThread.start();
        System.out.println("Main finished");


        //Программа заканчивает работать, когда ВСЕ потоки завершили работу
        //Если main закончил раньше, чем другие потоки, программа будет просто ждать завершиния остальных
    }

//    @Deprecated
//    private static void method() {
//
//    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        //Глупая работа, чтобы иммитировать "тяжелую работу" процессора
//        for (int i = 0; i < 1000_000_000; i++) {
            for (int j = 0; j < 1_000; j++) {
                try {
                    //1000 ms - 1 sec
                    //500 ms - 0.5 sec
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//        }

        System.out.println("MyRunnable finished");
    }
}