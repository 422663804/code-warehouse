package com.tian.day01;

public class ThreadMain {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("线程1");
        Thread1 thread2 = new Thread1("线程2");
        thread1.start();
        thread2.start();
        Thread2 thread3 = new Thread2("线程3");
        Thread2 thread4 = new Thread2("线程4");
//        thread3.run();
//        thread4.run();
    }
}
