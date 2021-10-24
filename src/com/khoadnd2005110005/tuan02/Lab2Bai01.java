package com.khoadnd2005110005.tuan02

import java.util.Scanner;

public class Lab2Bai01 {
    public static void main(String[] args) {
    //Khai báo Scanner mới
        Scanner scanner = new Scanner(System.in);
    //Khai báo các biến nhập    
        double soA = scanner.nextDouble();
        double soB = scanner.nextDouble();
        double x = -soB / soA;
    //Nhập a,b    
        System.out.println("Nhập b:");
        System.out.println("Nhập a:");
    
    //Phương Trình Bậc 1    
        if(soA == 0){
            if(soB == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else 
                System.out.println("Phương trình vô nghiệm");
        }else
            System.out.printf("Nghiệm của phương trình là x = %.2f",x);

    }
}