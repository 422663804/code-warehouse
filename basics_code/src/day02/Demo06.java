package day02;

import java.util.Scanner;

/**
 * 6. 从控制台输入一个用户名和一个密码进行登录，只有账号为admin密码为888888才能正常登陆，并打印“登陆成功”，
 * 否则输出登陆不成功的原因：用户名不对输出“用户名错误！登录失败！“，用户名正确但是密码错误则输出“密码错误！登录失败！”。
 */
public class Demo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = scanner.next();
        System.out.print("请输入密码:");
        String password = scanner.next();
        if (password.equals("888888") && username.equals("admin")) {
            System.out.println("登录成功");
        } else if (password.equals("888888") && !username.equals("admin")) {
            System.out.println("用户名错误！登录失败！");
        } else {
            System.out.println("密码错误！登录失败！");
        }
    }
}
