package day01;

import java.util.Scanner;

/**
 * 2. 从控制台输入一个数，判断是否是奇数并输出？(对2求余不为0)
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = scanner.nextInt();
        if (num % 2 != 0) {
            System.out.println("奇数:" + num);
        } else {
            System.out.println("偶数");
        }
    }
}
