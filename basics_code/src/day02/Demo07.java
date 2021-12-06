package day02;

import java.util.Scanner;

/**
 * 7.输入一个整数，如果等于0，把这个整数加2的结果输出；如果等于1,把这个整数加3的结果输出;如果等于2,把这个整数加4的结果输出;如果是其他的数就直接输出这个整数。
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入1个整数:");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("该数+2后的结果为:" + (num + 2));
        } else if (num == 1) {
            System.out.println("该数+3后的结果为:" + (num + 3));
        } else if (num == 2) {
            System.out.println("该数+42后的结果为:" + (num + 4));
        } else {
            System.out.println("该数为:" + num);
        }
    }
}
