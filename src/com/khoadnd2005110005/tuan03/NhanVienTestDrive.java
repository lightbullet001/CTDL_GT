package com.khoadnd2005110005.tuan03;

public class NhanVienTestDrive {
    
    public static void main(String[] args) {
        
        NhanVien nhanvien;
        
        nhanvien = new NhanVien("Đinh Ngọc Đăng Khoa", 6000000, "10 Hoa Sua", "DH Gia Dinh", "03-06-2002");
        
        System.out.println("Ten Nhan Vien: " + nhanvien.TenNhanVien + "Luong: " + nhanvien.Luong + "Dia Chi: " +nhanvien.diachi + "Bo phan lam viec: " + nhanvien.bophanlamviec + "Ngay Sinh: " + nhanvien.NgaySinh);
    }
    
}