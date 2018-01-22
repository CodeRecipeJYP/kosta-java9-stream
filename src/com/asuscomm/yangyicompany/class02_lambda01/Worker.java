package com.asuscomm.yangyicompany.class02_lambda01;

public class Worker {
    public void doIt() {
        System.out.print("Worker/ doit");

        Runnable aValueScopeRunnable = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println("Runnable 익명클래스를 따로 만들어서 Thread에 전달");
                System.out.println(value);
            }
        };


        Thread aValueScopeThread = new Thread(aValueScopeRunnable);
        aValueScopeThread.start();

        Thread bConstructorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int value = 26;
                System.out.println("Thread 인자로 전달된 Runnable 익명클래스");
                System.out.println(value);
            }
        });

    }
}
