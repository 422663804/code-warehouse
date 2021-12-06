package com.tian.day02;

import java.awt.*;

public class TestThreadMain {
    public static void main(String[] args) {
        TestThread thread1 = new TestThread("窗口1");
        TestThread thread2 = new TestThread("窗口2");
        TestThread thread3 = new TestThread("窗口3");

//        thread1.start();
//        thread2.start();
//        thread3.start();

        TestThread2 testThread = new TestThread2();
        Thread thread4 = new Thread(testThread);
        Thread thread5 = new Thread(testThread);
        Thread thread6 = new Thread(testThread);
        thread4.setName("售电影票窗口1");
        thread5.setName("售电影票窗口2");
        thread6.setName("售电影票窗口3");
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
