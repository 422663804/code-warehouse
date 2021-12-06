package com.tian.day03;

public class TestThread01 {
    private int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                ticket--;
                System.out.println("正在出售票：" + ticket);
            } else {
                break;
            }
        }
    }
}
