package day02;

import java.util.Scanner;

/**
 * 3.从控制台输入顾客的购物金额，最后打印其实际付款金额，购物享受折扣：顾客购物如果超过200元则打8折，超过500元7折，超过1000元5折，200以内不打折。
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入购物金额:");
        int money = scanner.nextInt();
        if (money > 200 && money <= 500) {
            System.out.println("打8折,您需支付:" + money * 0.8 + "元");
        } else if (money > 500 && money <= 1000) {
            System.out.println("打7折,您需支付:" + money * 0.7 + "元");
        } else if (money > 1000) {
            System.out.println("5折,您需支付:" + money * 0.5 + "元");
        } else {
            System.out.println("没有优惠,您需支付:" + money + "元");
        }
    }
}
