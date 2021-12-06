package day02;

import java.util.Scanner;

/**
 * 5. 输入三个整数，如果这三个整数都相等，那么输出“这三个数相等”。否则再判断这三个数之和是否大于1000，
 * 如果大于1000输出“这三个数之和大于1000”否则输出“这三个数之和不大于1000
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入3个整数:");
        System.out.print("请输入1个整数:");
        int num1 = scanner.nextInt();
        System.out.print("请输入2个整数:");
        int num2 = scanner.nextInt();
        System.out.print("请输入3个整数:");
        int num3 = scanner.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("三个数相等");
        } else if (num1 + num2 + num3 > 1000){
            System.out.println("这三个数之和大于1000");
        }else {
            System.out.println("这三个数之和不大于1000");
        }
    }
}
