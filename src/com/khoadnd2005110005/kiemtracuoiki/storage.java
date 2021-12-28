package com.khoadnd2005110005.kiemtracuoiki


public class storage {
Scanner scanner = new Scanner(System.in);
int thucpham, sanhsu, dienmay;
int id;
String tenhanghoa;
int gianhap;
int soluongtonkho;
int ngaynhapkho;

thucpham(){}
thucpham(int id, double gianhap, int soluongtonkho, int ngaynhapkho){
    id = idmoi1;
    gianhap = gianhapmoi1;
    soluongtonkho = soluongtonkho1;
    ngaynhapkho = ngaynhapkho1;

    CaKho thucpham
        thucpham = new CaKho("Cá Khô", 10000, 2, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + thucpham.idmoi1 + "Giá Nhập Hàng: " + thucpham.gianhapgmoi1 + "Số Lượng Tồn Kho: "+ thucpham.soluongtonkho1 + "Ngày Nhập Kho: " + thucpham.ngaynhapkho1);

    RauCai thucpham
        thucpham = new RauCai("Rau Cải", 8000, 6, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + thucpham.idmoi1 + "Giá Nhập Hàng: " + thucpham.gianhapgmoi1 + "Số Lượng Tồn Kho: "+ thucpham.soluongtonkho1 + "Ngày Nhập Kho: " + thucpham.ngaynhapkho1);

    GiaDo thucpham
        thucpham = new GiaDo("Giá Đỗ", 5000, 3, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + thucpham.idmoi1 + "Giá Nhập Hàng: " + thucpham.gianhapgmoi1 + "Số Lượng Tồn Kho: "+ thucpham.soluongtonkho1 + "Ngày Nhập Kho: " + thucpham.ngaynhapkho1);

    CaiThia thucpham
       thucpham = new CaiThia("Cải Thìa", 10000, 8, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + thucpham.idmoi1 + "Giá Nhập Hàng: " + thucpham.gianhapgmoi1 + "Số Lượng Tồn Kho: "+ thucpham.soluongtonkho1 + "Ngày Nhập Kho: " + thucpham.ngaynhapkho1);

    DauDo thucpham
        thucpham = new DauDo("Đậu Đỏ", 20000, 12, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + thucpham.idmoi1 + "Giá Nhập Hàng: " + thucpham.gianhapgmoi1 + "Số Lượng Tồn Kho: "+ thucpham.soluongtonkho1 + "Ngày Nhập Kho: " + thucpham.ngaynhapkho1);

    DauDen thucpham
        thucpham = new DauDen("Đậu Đen", 10000, 9, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + thucpham.idmoi1 + "Giá Nhập Hàng: " + thucpham.gianhapgmoi1 + "Số Lượng Tồn Kho: "+ thucpham.soluongtonkho1 + "Ngày Nhập Kho: " + thucpham.ngaynhapkho1);

    BiXanh thucpham
        thucpham = new BiXanh("Bí Xanh", 12000, 10, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + thucpham.idmoi1 + "Giá Nhập Hàng: " + thucpham.gianhapgmoi1 + "Số Lượng Tồn Kho: "+ thucpham.soluongtonkho1 + "Ngày Nhập Kho: " + thucpham.ngaynhapkho1);
}

sanhsu(){}
sanhsu(int id, double gianhap, int soluongtonkho, int ngaynhapkho){
    id = idmoi2;
    gianhap = gianhapmoi2;
    soluongtonkho = soluongtonkho2;
    ngaynhapkho = ngaynhapkho2;

      ChenSu sanhsu
        sanhsu = new ChenSu("Chén Sứ", 10000, 20, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + sanhsu.idmoi2 + "Giá Nhập Hàng: " + sanhsu.gianhapgmoi2 + "Số Lượng Tồn Kho: "+ sanhsu.soluongtonkho2 + "Ngày Nhập Kho: " + sanhsu.ngaynhapkho2);
    
      LySanh sanhsu
        sanhsu = new LySanh("Ly Sành", 12000, 18, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + sanhsu.idmoi2 + "Giá Nhập Hàng: " + sanhsu.gianhapgmoi2 + "Số Lượng Tồn Kho: "+ sanhsu.soluongtonkho2 + "Ngày Nhập Kho: " + sanhsu.ngaynhapkho2);

      ChenSanh sanhsu
        sanhsu = new ChenSanh("Chén Sành", 8000, 14, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + sanhsu.idmoi2+ "Giá Nhập Hàng: " + sanhsu.gianhapgmoi2 + "Số Lượng Tồn Kho: "+ sanhsu.soluongtonkho2 + "Ngày Nhập Kho: " + sanhsu.ngaynhapkho2);

      ToSanh sanhsu
        sanhsu = new ToSanh("Tô Sành", 10000, 8, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + sanhsu.idmoi2 + "Giá Nhập Hàng: " + sanhsu.gianhapgmoi2 + "Số Lượng Tồn Kho: "+ sanhsu.soluongtonkho2 + "Ngày Nhập Kho: " + sanhsu.ngaynhapkho2);

      GomSu sanhsu
        sanhsu = new GomSu("Gốm Sứ", 50000, 10, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + sanhsu.idmoi2 + "Giá Nhập Hàng: " + sanhsu.gianhapgmoi2 + "Số Lượng Tồn Kho: "+ sanhsu.soluongtonkho2 + "Ngày Nhập Kho: " + sanhsu.ngaynhapkho2);

      BinhBong sanhsu
        sanhsu = new BinhBong("Bình Bông", 15000, 5, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + sanhsu.idmoi2 + "Giá Nhập Hàng: " + sanhsu.gianhapgmoi2 + "Số Lượng Tồn Kho: "+ sanhsu.soluongtonkho2 + "Ngày Nhập Kho: " + sanhsu.ngaynhapkho2);

      DiaSanh sanhsu
        sanhsu = new DiaSanh("Đĩa Sành", 10000, 7, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + sanhsu.idmoi2 + "Giá Nhập Hàng: " + sanhsu.gianhapgmoi2 + "Số Lượng Tồn Kho: "+ sanhsu.soluongtonkho2 + "Ngày Nhập Kho: " + sanhsu.ngaynhapkho2);
    }

dienmay(){}
dienmay(int id, double gianhap, int soluongtonkho, int ngaynhapkho){
    id = idmoi3;
    gianhap = gianhapmoi3;
    soluongtonkho = soluongtonkho3;
    ngaynhapkho = ngaynhapkho3;

    MayLanh dienmay
        dienmay = new MayLanh("Máy Lạnh", 12000000, 10, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + dienmay.idmoi3 + "Giá Nhập Hàng: " + dienmay.gianhapgmoi3 + "Số Lượng Tồn Kho: "+ dienmay.soluongtonkho3 + "Ngày Nhập Kho: " + dienmay.ngaynhapkho3);

    MayGiat dienmay
        dienmay = new MayGiat("Máy Giặt", 7000000, 8, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + dienmay.idmoi3 + "Giá Nhập Hàng: " + dienmay.gianhapgmoi3 + "Số Lượng Tồn Kho: "+ dienmay.soluongtonkho3 + "Ngày Nhập Kho: " + dienmay.ngaynhapkho3);

    TV dienmay
        dienmay = new TV("TV", 8000000, 5, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + dienmay.idmoi3 + "Giá Nhập Hàng: " + dienmay.gianhapgmoi3 + "Số Lượng Tồn Kho: "+ dienmay.soluongtonkho3 + "Ngày Nhập Kho: " + dienmay.ngaynhapkho3);

    TuLanh dienmay
        dienmay = new TuLanh("Tủ Lạnh", 12000000, 10, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + dienmay.idmoi3 + "Giá Nhập Hàng: " + dienmay.gianhapgmoi3 + "Số Lượng Tồn Kho: "+ dienmay.soluongtonkho3 + "Ngày Nhập Kho: " + dienmay.ngaynhapkho3);

    MayRuaChen dienmay
        dienmay = new MayRuaChen("Máy Rửa Chén", 15000000, 20, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + dienmay.idmoi3 + "Giá Nhập Hàng: " + dienmay.gianhapgmoi3 + "Số Lượng Tồn Kho: "+ dienmay.soluongtonkho3 + "Ngày Nhập Kho: " + dienmay.ngaynhapkho3);

    MaySuoi dienmay
        dienmay = new MaySuoi("Máy Sưởi", 15000000, 15, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + dienmay.idmoi3 + "Giá Nhập Hàng: " + dienmay.gianhapgmoi3 + "Số Lượng Tồn Kho: "+ dienmay.soluongtonkho3 + "Ngày Nhập Kho: " + dienmay.ngaynhapkho3);

    MaySayToc dienmay
        dienmay = new MaySayToc("Máy Sấy Tóc", 1000000, 30, 20/10/2002);
        System.out.println("Tên Sản Phẩm: " + dienmay.idmoi3 + "Giá Nhập Hàng: " + dienmay.gianhapgmoi3 + "Số Lượng Tồn Kho: "+ dienmay.soluongtonkho3 + "Ngày Nhập Kho: " + dienmay.ngaynhapkho3);
}

void inThongTinstorage() {
    System.out.println("Thực Phẩm: " +thucpham);
    System.out.println("Sành Sứ: " +sanhsu);
    System.out.println("Điện Máy: " +dienmay);

} 

}