package com.tian.day02;

public class TestThread2 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println("当前售出第" + ticket-- + "张票===" + Thread.currentThread().getName());
            } else {
                System.out.println("电影票已售完");
                break;
            }
        }
    }
}
