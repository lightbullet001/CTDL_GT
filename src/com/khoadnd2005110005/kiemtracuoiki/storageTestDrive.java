package com.khoadnd2005110005.kiemtracuoiki

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.khoadnd2005110005.kiemtracuoiki.storage;

public class storageTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        static List<storage> lstorages = new ArrayList<>();
        storage()
    {

        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÀNG HÓA");
		System.out.println(">>>>>>>>>>>>>MENU<<<<<<<<<<<<<");
		
        Scanner scanner = new Scanner(System.in);
		
        int suLuaChon;
		System.out.println("Lựa chọn Chức năng: ");
		suLuaChon = scanner.nextInt();
		ArrayList<storage>  = thucpham.storage(), sanhsu.storage(), dienmay.storage();
		switch (suLuaChon) {
		case 1:
			them(storage);
			break;

		case 2:
			timkiem(storage);
			break;

		case 3:
			sapxep(storage);
			break;

		case 4:
			hienthidanhsach(storageTestDrive);
			break;

		default:
			System.out.println("Thử Lại");
		}

		scanner.close();
	}
    }

       public void menu(){
           System.out.println("==============MENU=============");
           System.out.println("=1=======Thêm Hàng Hóa==========");
           System.out.println("=2=======Tìm Kiếm Hàng Hóa===========");
           System.out.println("=3=======Sắp Xếp Hàng Hóa===========");
           System.out.println("=4======Danh Sách Hàng Đã Thêm==========");
           System.out.println("==============Thoát=============");
       }
    
       

       public void displaystorage(){
        System.out.println("==========Mặt Hàng========");
        System.out.printf("%-20S %-20S %-20S %-20S\n","Mã Định Danh", "Giá Nhập Kho ", "Số Lượng Tồn Kho", "Ngày Nhập Kho");
   }

       public void display()
       {
           for (storage storage : lstorages) {
               thucpham.displaystorage();
                System.out.printf("%-10S %-10S %-10S %-10S\n",idmoi1, gianhapgmoi1,soluongtonkho1, ngaynhapkho1);
               sanhsu.displaystorage();
                System.out.printf("%-10S %-10S %-10S %-10S\n",idmoi2, gianhapgmoi2,soluongtonkho2, ngaynhapkho2);
               dienmay.displaystorage();
                System.out.printf("%-10S %-10S %-10S %-10S\n",idmoi3, gianhapgmoi3,soluongtonkho3, ngaynhapkho3);
               
            }
       
       public void addstorage()
       {
           System.out.println("Nhập Sản Phẩm Cần Thêm:");
           int n = scanner.nextInt();
           for(int  i = 0; i < n; i++)
           {
               thucpham storage = new storage();
               input();
               lstorages.add(n);

               sanhsu storage = new storage();
               input();
               lstorages.add(n);

               dienmay storage = new storage();
               input();
               lstorages.add(n);
           }
       }
       
       public static void selectionSort (int[] arr ) {
    
        for (int i = 0, i < arr.length - 1, i++)
        {
            int index = i;
            for (int j = i + 1, i < arr.length, j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }

            int id = arr[index];
            arr[index] = arr[i];
            arr[i] = id;
        }
    
    }

       public void find()
       {
           System.out.println("Nhập Mã Nhận Dạng Cần Tìm:");
           int id = scanner.nextLine();
           for (storage storage : lstorages) {
               if(id.equals(storage.id)){
                   id.displaystorage();
               }
           }
       }
       
        
    }
}