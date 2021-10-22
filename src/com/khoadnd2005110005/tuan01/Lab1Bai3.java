package com.khoadnd2005110005.tuan01

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canh = scanner.nextInt();
        int theTich = canh * canh * canh;
        
        System.out.println("Nhập vào cạnh của khối lập phương:");
        System.out.printf("thể tích khối lập phương : %d",theTich);
    }
}