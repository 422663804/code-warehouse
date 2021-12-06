package day02;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * 9. 输入4个数字，最后输出最小的数字。
 */
public class Demo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第1位数:");
        int num1 = scanner.nextInt();
        System.out.print("请输入第2位数:");
        int num2 = scanner.nextInt();
        System.out.print("请输入第3位数:");
        int num3 = scanner.nextInt();
        System.out.print("请输入第4位数:");
        int num4 = scanner.nextInt();
        // 用数组比较
        int[] arrays = new int[]{num1, num2, num3, num4};
        System.out.println(Arrays.stream(arrays).min());
        // 用if -else if 比较
    }
}
