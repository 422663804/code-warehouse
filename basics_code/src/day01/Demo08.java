package day01;

import java.util.Scanner;

/**
 * 8. 从控制台输入顾客的购物金额，打印其享受折扣后最终支付的金额：超过200元则打8折，否则9折。
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入购物的金额:");
        double money = scanner.nextDouble();
        if (money > 200) {
            System.out.println("优惠8折,您需要支付:" + money * 0.8 + "元");
        } else {
            System.out.println("优惠9折,您需要支付:" + money * 0.9 + "元");
        }
    }
}
