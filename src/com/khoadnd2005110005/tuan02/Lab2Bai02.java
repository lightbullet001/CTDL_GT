package com.khoadnd2005110005.tuan02

import java.util.Scanner;

public class Lab2Bai02 {
    public static void main(String[] args) {
    //Khai báo Sanner mới
        Scanner scanner = new Scanner(System.in);
    //Khai báo các biến nhập
        double soA = scanner.nextDouble();
        double soB = scanner.nextDouble();
        double soC = scanner.nextDouble();
        double delta = Math.pow(soB, 2) -4 * soA * soC;

    //Nhập a,b,c
        System.out.println("Nhập số a: ");
        System.out.println("Nhập số b: ");
        System.out.println("Nhập số c: ");

    //Thuật toán giải PT Bậc 2    
        if(soA == 0){
            if(soB == 0){
                if(soC == 0){
                    System.out.println("Phương trình vô số nghiệm");
                }else
                    System.out.println("Phương trình vô nghiệm");
            }else
            System.out.printf("Phương trình có nghiệm x = %.2f",-soC/soB);
        }else
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }else
                if(delta == 0){
                    System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f",-soB /(2*soA));
                }else
                    System.out.printf("x1 = %.2f x2 = %.2f",(-soB + Math.sqrt(delta)) / (2 * soA), (-soB -Math.sqrt(delta) / (2 *soA)));
    }
}