package com.khoadnd2005110005.tuan03;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh maytinh;
        maytinh = new MayTinh("Dinh Ngoc Dang Khoa", 2002, "Window 10", "32Gb", "GiGaByte", 10000000, 3);
        System.out.println("Nha san xuat: " + maytinh.Nhasanxuat + "Nam san xuat: " + maytinh.Namsanxuat + "He dieu hanh: "+ maytinh.Hedieuhanh + "RAM: " + maytinh.Ram + "CPU: " + maytinh.CPU + "Gia: " + maytinh.Gia + "Nam bao hanh: " + maytinh.nambaohanh);
    }
    
}
