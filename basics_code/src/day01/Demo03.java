package day01;

/**
 * 3. 定义一个整数变量，值为4612，判断该数是否能同时被3和13整除？
 */
public class Demo03 {
    public static void main(String[] args) {
        int num = 4612;
        if (num % 3 == 0 && num % 13 == 0){
            System.out.println("不能同时被3和13整除");
        }else {
            System.out.println("true");
        }
    }
}
