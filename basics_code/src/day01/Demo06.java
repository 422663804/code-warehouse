package day01;

import java.util.Scanner;

/**
 * 6. 从控制台输入张三的Java成绩和音乐成绩，最后输出他是否有奖励(true/false)，
 * 奖励条件是：【张浩Java成绩大于98分，而且音乐成绩大于80分】，老师奖励他，或者【Java成绩等于100分，音乐成绩大于70分】，老师也可以奖励他
 */
public class Demo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入Java成绩:");
        double javaScore = scanner.nextDouble();
        System.out.print("请输入音乐成绩:");
        double musicScore = scanner.nextDouble();
        if (javaScore > 98 && musicScore > 80) {
            System.out.println(true);
        } else {
            System.out.println(javaScore == 100 && musicScore > 70);
        }
    }
}
