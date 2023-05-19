package com.example.demo.test;

/**
 * @author: zhaoyun
 * @version: v1.0
 * @description: com.example.demo.test
 * @date:2023/5/16
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(getNum());
    }

    public static int getNum(){
        int i = 0;
        try{
            i=4;
            System.out.println("****" + i);
            return i;
        }finally {
            i++;
            System.out.println("----" + i);
        }
    }
}
