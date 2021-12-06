package day02;

import java.util.Scanner;

/**
 * 4. 猴子去买桃，如果买3个以下，老板就不送桃，如果买3个到5个就再送一个桃，如果买5个以上就送2个桃，现在要求输入猴子的买桃数，最后输出到底买到了几个桃。
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("你想购买几个桃:");
        int num = scanner.nextInt();
        if (num < 3) {
            System.out.println("不送桃,你一共有" + num + "桃");
        } else if (num <= 5) {
            System.out.println("送你一个桃,你一共有" + (num + 1) + "桃");
        } else {
            System.out.println("送你2个桃,你一共有" + (num + 2) + "桃");
        }
    }
}
