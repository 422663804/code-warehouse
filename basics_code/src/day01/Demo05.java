package day01;

import java.util.Scanner;

/**
 * 5. 从控制台输入一个整数，判断该数是否为条件数？（条件数：该数字能被5整除或者十位数为5即为条件数。）
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = scanner.nextInt();
        if (num % 5 == 0 || num / 10 % 10 == 5) {
            System.out.println("该数为条件数:" + num);
        } else {
            System.out.println("false");
        }
    }
}
