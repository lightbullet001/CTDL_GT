package com.khoadnd2005110005.tuan02

import java.util.Scanner;

public class Lab2Bai03 {
    public static void main(String[] args) {
    //Khai báo Sanner mới 
        Scanner scanner = new Scanner(System.in);
    //Khai báo biến nhập
        int soDien = scanner.nextInt();
        System.out.println("Nhập vào số điện:");
        
        if(soDien <= 50){
            System.out.printf("số tiền phải trả là : %.2d",soDien*1000);
        }else
            System.out.printf("số tiền phải trả là : %.2d",50 * 1000 + (soDien - 50) * 1200);
    }
}