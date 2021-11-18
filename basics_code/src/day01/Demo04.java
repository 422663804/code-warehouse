package day01;

import java.util.Scanner;

/**
 * 4. 从控制台输入一个整数，判断该数是否为4位数？
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = scanner.nextInt();
        if (num > 999 && num < 10000){
            System.out.println("4位数");
        }else {
            System.out.println("false");
        }
    }
}
