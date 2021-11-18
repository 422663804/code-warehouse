package day01;

import java.util.Scanner;

/**
 * 7. 从控制台输入一个数，打印该数字的奇偶性（即奇数打印该数字为奇数，偶数打印该数字为偶数）。
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
