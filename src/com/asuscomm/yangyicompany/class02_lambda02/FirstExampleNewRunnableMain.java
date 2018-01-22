package com.asuscomm.yangyicompany.class02_lambda02;

public class FirstExampleNewRunnableMain {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("나는 왜 여기 왔는가");
        }).start();
    }
}
