package com.khoadnd2005110005.tuan03;

import java.util.Scanner;

public class Lab3bai1 {
    public static void main(String[] args) {
        
        System.out.println("Nhập vào số nguyên n: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int SoNguyen = scanner.nextInt();
        
        boolean check = true;
        
        for(int i =2; i < SoNguyen; i++){
            if(SoNguyen % i == 0){ 
            check = false;
            break;
            }
        }
        if(check == true)
            System.out.printf("%d là số nguyên tố",SoNguyen);
        else
            System.out.printf("%d không phải là số nguyên tố",SoNguyen);
    }

}