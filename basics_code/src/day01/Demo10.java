package day01;

import java.util.Scanner;

/**
 * 10. 从控制台输入两个数字作为系统登录指标，如果第一个数字能被3整除，并且第二个数字为123456则输出“登录成功”，否则输出“登录失败”。
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数:");
        int num1 = scanner.nextInt();
        System.out.print("请输入第二个整数:");
        int num2 = scanner.nextInt();
        if (num1 % 3 == 0 && num2 == 123456) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
