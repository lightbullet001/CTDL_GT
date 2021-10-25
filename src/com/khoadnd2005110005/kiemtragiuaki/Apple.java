package com.khoadnd2005110005.kiemtragiuaki

public class Apple {
    int id;
    int khoiluong;
    String mausac;
    
    Apple(){}
    Apple (int id, double khoiluong, String mausac){
        id = idmoi;
        khoiluong = khoiluongmoi;
        mausac = mausacmoi;
    }


    void inThongTinApple() {
        System.out.println("Mã Định Danh: " +id);
        System.out.println("Khối lượng: " +khoiluong);
        System.out.println("Màu Sắc: " +mausac);
    }
}
