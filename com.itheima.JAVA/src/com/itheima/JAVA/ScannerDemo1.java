package com.itheima.JAVA;

import java.util.Scanner;

/**
 * ClassName: scanner
 * Package: com.itheima.JAVA
 * Description:
 *
 * @Author: Nathan
 * @Create: 2024/1/9 - 23:30
 * @Version: v1.0
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄");
        int age = sc.nextInt();
        System.out.println("您的年龄是：" + age);
        System.out.println("请输入您的名字：");
        String name = sc.next();
        System.out.println(name + "欢迎您进入系统");
    }
}
