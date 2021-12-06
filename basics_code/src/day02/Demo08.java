package day02;

import java.util.Random;
import java.util.Scanner;

/**
 * 8. 随机生成-5到5之间的整数，
 * 从控制台输入一个整数进行猜数字游戏，如果输入的数字和随机数是一正一负则输，如果随机数为0则无输赢，
 * 如果输入的数字和随机数都是正数，且输入的数字大于随机数则赢，否则输，如果输入的数字和随机数都是负数，且输入的数字小于随机数则赢，否则输。
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(10) - 5;
        System.out.print("请输入一个整数:");
        int num = scanner.nextInt();
        if (i >= 0 && num >= 0 && num > i) {
            System.out.println("WIN");
        } else if (i < 0 && num < 0 && num < i) {
            System.out.println("WIN");
        } else {
            System.out.println("FAIL");
        }
    }
}
