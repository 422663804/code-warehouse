package com.tian.day01;

public class Thread1 extends Thread {
    private final String name;

    public Thread1(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "启动");
            try {
                // 设置休眠时间1s
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}