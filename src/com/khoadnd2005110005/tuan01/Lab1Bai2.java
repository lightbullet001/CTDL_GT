package com.khoadnd2005110005.tuan01

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
    // Khai báo Sanner mới    
        Scanner sc = new Scanner(System.in);
    // Khai báo các biến nhập    
        int chieuRong = sc.nextInt();
        int chieuDai = sc.nextInt();
        int chuVi = (chieuDai + chieuRong)*2;
        int dienTich = chieuDai * chieuRong;
    //Xuất ra màn hình
        System.out.println("nhập chiều rộng:");
        System.out.println("nhập chiều dài:");
        System.out.printf("chu vi hình chữ nhật: %d",chuVi);
        System.out.printf("diện tích hình chữ nhật: %d",dienTich);
    }
}