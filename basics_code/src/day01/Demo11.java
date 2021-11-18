package day01;

import java.util.Scanner;

/**
 * 11. 输入一个数字作为会员号，如果该会员号符合要求则输出“合法的会员号”，否则输出“该会员号不存在！请检查后重新输入！”，
 * 会员号条件：该数字是四位数，且各个位数之和能被3整除。
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的会员号:");
        int num = scanner.nextInt();
        int one = num % 10;
        int two = num / 10 % 10;
        int three = num / 100 % 10;
        int four = num / 1000 % 10;
        int sum = one + two + three + four;
        if (num > 999 && num < 10000 && sum % 3 == 0) {
            System.out.println("合法的会员号");
        } else {
            System.out.println("该会员号不存在！请检查后重新输入!");
        }

    }
}
