package com.khoadnd2005110005.kiemtragiuaki

public class AppleTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        static List<Apple> lApple = new ArrayList<>();
        Apple()
    {

    }

       public void menu(){
           System.out.println("==============MENU=============");
           System.out.println("=1=======Tạo Apple Mới==========");
           System.out.println("=2=========Thêm Apple Vào===========");
           System.out.println("=3========Tìm Kiếm Apple===========");
           System.out.println("=4======Hiển Thị Apple==========");
           System.out.println("==============Thoát=============");
       }
       public void input()
       {
           System.out.println("Nhập Apple Mới:");
           idmoi = scanner.nextInt();
           System.out.println("Nhập Khối Lượng Apple:");
           khoiluongmoi = scanner.nextFloat();
           scanner.nextLine();
           System.out.println("Nhập Màu Sắc Apple:");
           mausacmoi = scanner.nextLine();
       }
       public void displayApple(){
            System.out.println("==========Apple========");
            System.out.printf("%-20S %-20S %-20S\n","Mã Định Danh applle", "Khối Lượng apple", "Màu Sắc apple");
       }
       public void display()
       {
           for (Apple apple : lApple) {
               apple.displayApple();
                System.out.printf("%-20d %-20.2f %-20S\n",idmoi, khoiluongmoi,mausacmoi);
           }
           
       }
       public void addApple()
       {
           System.out.println("Nhập Tổng Số Apple:");
           int n = scanner.nextInt();
           for(int  i = 0; i < n; i++)
           {
               Apple apple = new Apple();
               input();
               lApple.add(apple);
           }
       }
       public void find()
       {
           System.out.println("Nhập Màu Sắc Cần Tìm:");
           String name = scanner.nextLine();
           for (Apple apple : lApple) {
               if(name.equals(apple.color)){
                   apple.displayApple();
               }
           }
       }
       
        
    }
}