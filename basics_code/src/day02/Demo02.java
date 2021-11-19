package day02;

import java.util.Scanner;

/**
 * 2. 从控制台输入一个数字和一个字符串（当做密码）作为系统登录指标，如果这个数字被3整除，并且密码为"abc123"则输出“登录成功”，否则输出“登录失败”。
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的数字:");
        int scannerNum = scanner.nextInt();
        System.out.print("请输入你的密码:");
        String password = scanner.next();
        if (scannerNum % 3 == 0 && password.equals("abc123")) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
