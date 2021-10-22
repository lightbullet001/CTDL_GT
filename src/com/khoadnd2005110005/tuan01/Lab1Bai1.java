package com.khoadnd2005110005.tuan01;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
    //khai báo Scanner mới    
        Scanner sc = new Scanner(System.in);
    // Khai báo các biến nhập bằng Scanner    
        String hoTen = sc.nextLine();
        double diemTB = sc.nextDouble();
    //Xuất ra màn hình    
        System.out.println("Nhập vào tên sinh viên:");
        System.out.println("Điểm trung bình:");
        System.out.printf("%s",hoTen);
        System.out.printf("Diem TB: %.2f",diemTB);
    }
}