package com.khoadnd2005110005.trial;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

import com.khoadnd2005110005.trial.MatHang;

public class Data {

	public static ArrayList<MatHang> danhsachhanghoa() {
		ArrayList<MatHang> danhsachhang = new ArrayList<MatHang>();
		danhsachhang.add(new MatHang("Thực phẩm", "VN01", "Gạo Thơm Lài", 14000, 20, "02/03/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN02", "Sữa Bột Milo", 50000, 25, "05/01/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN03", "Nước suối Vĩnh Hảo", 5000, 150, "12/03/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN04", "Thanh Long Đỏ", 15000, 200, "12/02/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN05", "Trứng vịt Ba Huân", 20000, 20, "05/04/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN06", "Mì Hảo Hảo Tôm Chua Cay", 6000, 100, "06/03/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN07", "Nước Tương Nam Dương ", 12000, 50, "09/02/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN08", "Ngũ cốc dinh dưỡng", 30000, 20, "08/01/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN09", "Bánh mì tươi", 12000, 500, "09/03/2021"));
		danhsachhang.add(new MatHang("Thực phẩm", "VN010", "Bánh Quy Kem", 12000, 42, "12/02/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN011", "Chén sứ Minh Long", 20000, 200, "15/10/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN012", "Dĩa sứ Minh Long", 15000, 200, "15/10/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN013", "Muỗng Sứ Minh Long", 25000, 200, "15/02/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "Vn014", "Ly sứ Nhật bản", 100000, 200, "14/04/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN015", "Bát gốm Bát Tràng", 140000, 300, "15/05/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN016", "Chậu hoa sứ", 150000, 1000, "16/06/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN017", "Lọ hoa sứ", 170000, 200, "17/01/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN018", "Chuông gió nhập khẩu", 20000, 1000, "20/04/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN019", "Bộ ấm trà", 25000, 1000, "15/02/2021"));
		danhsachhang.add(new MatHang("Sành sứ", "VN020", "Đũa sứ 1 đôi", 25000, 400, "20/01/2022"));
		danhsachhang.add(new MatHang("Điện máy", "VN021", "Tủ lạnh Samsung Inverter", 5000000, 200, "14/07/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN022", "Samsung Smart TV QLED", 6000000, 200, "22/05/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN023", "Máy Lọc Nước Aqua ", 800000, 500, "02/12/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN024", "Quạt đứng Senko", 150000, 500, "24/03/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN025", "Daikin Inverter 1.5 HP", 5600000, 500, "22/10/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN026", "Bếp Điện SunHouse", 1200000, 400, "26/11/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN027", "Nồi cơm điện tử SunHouse 1,8L", 3200000, 300, "20/05/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN028", "Quạt mini Asian", 500000, 300, "22/10/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN029", "Bàn ủi hơi nước Philips", 3200000, 300, "26/08/2021"));
		danhsachhang.add(new MatHang("Điện máy", "VN030", "Máy xay đa năng Kangaroo", 800000, 500, "26/01/2021"));
		return danhsachhang;
	}

	public static ArrayList<Menu> BangMenu() {
		// menu them, xoa, sua
		ArrayList<Menu> LuaChonMenu = new ArrayList<Menu>();
		LuaChonMenu.add(new Menu(1, "1. Thêm"));
		LuaChonMenu.add(new Menu(2, "2. Xóa"));
		LuaChonMenu.add(new Menu(3, "3. Sửa"));
		LuaChonMenu.add(new Menu(4, "4. Tìm kiếm"));
		LuaChonMenu.add(new Menu(5, "5. Sắp xếp"));
		LuaChonMenu.add(new Menu(6, "6. Thống kê"));

		return LuaChonMenu;

	}

	public static ArrayList<Menu> BangMenuTimKiem() {
		ArrayList<Menu> LuaChonMenuTimKiem = new ArrayList<Menu>();
		LuaChonMenuTimKiem.add(new Menu(1, "1. Tìm kiếm theo loại"));
		LuaChonMenuTimKiem.add(new Menu(2, "2. Tìm kiếm theo giá"));
		LuaChonMenuTimKiem.add(new Menu(3, "3. Tìm kiếm theo mã nhận dạng"));
		LuaChonMenuTimKiem.add(new Menu(4, "4. Tìm kiếm theo ngày"));
		LuaChonMenuTimKiem.add(new Menu(5, "5. Tìm kiếm theo ngày ...đến ngày..."));
		LuaChonMenuTimKiem.add(new Menu(6, "6. Tìm kiếm theo giá ...đến giá..."));
		return LuaChonMenuTimKiem;
	}

	public static ArrayList<Menu> bangMenuSapXep() {
		ArrayList<Menu> LuaChonMenuSapXep = new ArrayList<Menu>();
		LuaChonMenuSapXep.add(new Menu(1, ".1. Sắp xếp giá nhập tăng dần"));
		LuaChonMenuSapXep.add(new Menu(2, "2. Sắp xếp giá nhập giảm dần"));
		LuaChonMenuSapXep.add(new Menu(3, "3. Sắp xếp ngày nhập tăng dần"));
		LuaChonMenuSapXep.add(new Menu(4, "4. Sắp xếp ngày nhập giảm dần"));
		LuaChonMenuSapXep.add(new Menu(5, "5. Sắp xếp theo loại ngày"));
		LuaChonMenuSapXep.add(new Menu(6, "6. Sắp xếp theo giá ngày"));
		return LuaChonMenuSapXep;
	}
	
	public static ArrayList<Menu> BangMenuThongKe() {
		ArrayList<Menu> LuaChonMenuThongKe = new ArrayList<Menu>();
		LuaChonMenuThongKe.add(new Menu(1, "1. Thống kê tổng số lượng hàng hóa"));
		LuaChonMenuThongKe.add(new Menu(2, "2. Thống kê tổng giá trị hàng hóa"));
		LuaChonMenuThongKe.add(new Menu(3, "3. Thống kê tổng số lượng từng loại hàng hóa"));
		return LuaChonMenuThongKe;
	}
}