package day01;

import java.util.Scanner;

/**
 * 9. 从控制台输入一个数，如果这个数字为100以内的正数且能被5整除则输出“遇上了对的人”否则输出“没确认过眼神”。
 */
public class Demo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = scanner.nextInt();
        if (num < 100 && num > 0 && num % 5 == 0) {
            System.out.println("遇上了对的人");
        }else {
            System.out.println("没确认过眼神");
        }
    }
}
