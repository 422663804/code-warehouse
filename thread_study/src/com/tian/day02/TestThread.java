package com.tian.day02;

public class TestThread extends Thread {
    public static int ticket = 100;
    private final String name;

    public TestThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + "正在售出第" + ticket-- + "张票");
//                ticket--;
            } else {
                break;
            }
        }
    }
}
