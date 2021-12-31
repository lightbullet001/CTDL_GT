package com.khoadnd2005110005.trial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.khoadnd2005110005.trial.Data;
import com.khoadnd2005110005.trial.MatHang;
import com.khoadnd2005110005.trial.SapxepHangHoa;
import com.khoadnd2005110005.trial.ThongKeMatHang;
import com.khoadnd2005110005.trial.TimKiemHangHoa;

public class PhanMemQuanLy {

	private static ArrayList<MatHang> danhsachhang;

	public static void main(String[] args) {

		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÀNG HÓA");
		System.out.println(">>>>>>>>>>>>>MENU<<<<<<<<<<<<<");
		danhsachhang = Data.danhsachhanghoa();
		ArrayList<Menu> LuaChonMenu = Data.BangMenu();
		for (int i = 0; i < LuaChonMenu.size(); i++) {
			System.out.println(LuaChonMenu.get(i).tenmenu);

		}
		Scanner scanner = new Scanner(System.in);
		int suLuaChon;
		System.out.println("Xin Chọn Thao Tác: ");
		suLuaChon = scanner.nextInt();
		ArrayList<MatHang> danhsachhang = Data.danhsachhanghoa();
		switch (suLuaChon) {
		case 1:
			them(danhsachhang);
			break;
		case 2:
			xoahanghoa(danhsachhang);
			break;
		case 3:
			sua(danhsachhang);
			break;
		case 4:
			timKiem(	);
			break;
		case 5:
			sapxep(danhsachhang);
			break;
		case 6:
			thongke(danhsachhang);
			break;

		default:
			System.out.println("Vui Lòng Chọn Lại Đi");
		}

		scanner.close();
	}

	private static void timKiem() {
		System.out.println("Chọn Cách Tìm Kiếm");
		ArrayList<Menu> LuaChonMenuTimKiem = Data.BangMenuTimKiem();
		for (int i = 0; i < LuaChonMenuTimKiem.size(); i++) {
			System.out.println(LuaChonMenuTimKiem.get(i).tenmenu);
		}
		Scanner scanner = new Scanner(System.in);
		int luachon;
		luachon = scanner.nextInt();
		switch (luachon) {
		case 1:
			timhanghoatheoloai(danhsachhang);
			break;
		case 2:
			timkiemtheogia(danhsachhang);
			break;
		case 3:
			timkiemtheoma(danhsachhang);
			break;
		case 4:
			timkiemtheongay(danhsachhang);
			break;
		case 5:
			timkiemtheokhoangngay(danhsachhang);
			break;
		case 6:
			timkiemtheokhoanggia(danhsachhang);
			break;

		default:
			System.out.println("Vui Lòng Chọn Lại");
		}

		scanner.close();
	}

	private static void sapxep(ArrayList<MatHang> danhsachhang) {
		System.out.println("Chọn kiểu sắp xếp");
		ArrayList<Menu> LuaChonMenuSapXep = Data.bangMenuSapXe();
		for (int i = 0; i < LuaChonMenuSapXep.size(); i++) {
			System.out.println(LuaChonMenuSapXep.get(i).tenmenu);
		}
		Scanner scanner = new Scanner(System.in);
		int luachon;
		luachon = scanner.nextInt();
		switch (luachon) {
		case 1:
			sapxepgianhaptangdan(danhsachhang);
			break;
		case 2:
			sapxepgianhapgiamdan(danhsachhang);
			break;
		case 3:
			sapxepngaynhaptangdan(danhsachhang);
			break;
		case 4:
			sapxepngaynhapgiamdan(danhsachhang);
			break;
		case 5:
			sapxeptheoloaingay(danhsachhang);
			break;
		case 6:
			sapxeptheogiangay(danhsachhang);
			break;
		default:
			System.out.println("Vui Lòng Chọn Lại");
		}

		scanner.close();
	}

	private static void thongke(ArrayList<MatHang> danhsachhang) {
		System.out.println("Chọn loại thống kê");
		ArrayList<Menu> LuaChonMenuThongKe = Data.BangMenuThongKe();
		for (int i = 0; i < LuaChonMenuThongKe.size(); i++) {
			System.out.println(LuaChonMenuThongKe.get(i).tenmenu);
		}
		Scanner scanner = new Scanner(System.in);
		int luachon;
		luachon = scanner.nextInt();
		switch (luachon) {
		case 1:
			thongketongsoluonghanghoa(danhsachhang);
			break;
		case 2:
			thongketonggiatrihanghoa(danhsachhang);
			break;
		case 3:
			thongkesoluongtungloai(danhsachhang);
			break;
		default:
			System.out.println("Vui Lòng Chọn Lại");
		}

		scanner.close();
	}

//================thêm==================
//======================================
	static void them(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng thêm");
		System.out.println("Nhập thông tin hàng hóa");
		Scanner scanner = new Scanner(System.in);
		String loai;
		System.out.print("-Loại hàng hóa: ");
		loai = scanner.nextLine();

		String manhandang;
		System.out.print("-Mã Nhận Dạng: ");
		manhandang = scanner.nextLine();

		String tenhanghoa;
		System.out.print("-Tên hàng hóa: ");
		tenhanghoa = scanner.nextLine();

		double gianhapkho;
		System.out.print("-Giá nhập kho: ");
		gianhapkho = scanner.nextDouble();

		int soluongtonkho;
		System.out.print("-Số lượng tồn kho: ");
		soluongtonkho = scanner.nextInt();

		String ngaynhapkho;
		Scanner sc = new Scanner(System.in);
		System.out.print("-Ngày nhập kho: ");
		ngaynhapkho = sc.nextLine();
		sc.close();
		scanner.close();

		MatHang hanghoathem = new MatHang(loai, manhandang, tenhanghoa, gianhapkho, soluongtonkho, ngaynhapkho);

		System.out.println("---Đã thêm vào thành công---");
		System.out.println("-Số lượng hàng hóa trước khi thêm là: " + danhsachhang.size());

		danhsachhang.add(hanghoathem);

		System.out.println("-Số lượng hàng hóa sau khi thêm là: " + danhsachhang.size());

		System.out.println("Chi tiết hàng hóa đã thêm vào là:");
		System.out.println("Loại: " + hanghoathem.loai);
		System.out.println("Mã hàng: " + hanghoathem.manhandang);
		System.out.println("Tên hàng: " + hanghoathem.tenhanghoa);
		System.out.println("Giá Hàng: " + hanghoathem.gianhapkho);
		System.out.println("Số lượng tồn kho: " + hanghoathem.soluongtonkho);
		System.out.println("Ngày nhập kho: " + hanghoathem.ngaynhapkho);
	}

//=====================Xóa=====================================================================
//=============================================================================================
	static void xoahanghoa(ArrayList<MatHang> danhsachhang) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("---Tên hàng hóa cần xóa---");
		String tenhanghoa = scanner.nextLine();

		MatHang hangHoa = TimKiemHangHoa.timhanghoatheoten(tenhanghoa, danhsachhang);
		if (hangHoa != null) {
			if (danhsachhang.remove(hangHoa)) {
				System.out.println("--Đã xóa thành công--");
			} else
				System.out.println("Xóa hàng hóa thất bại");
		} else
			System.out.println("Ko tìm thấy hàng hóa nào trong ds với tên " + tenhanghoa);
		scanner.close();
	}

//===============sửa========================================================================
//==========================================================================================
	static void sua(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng sửa");

		Scanner scanner = new Scanner(System.in);

		System.out.println("---Tên hàng hóa cần sửa---");

		String tenhanghoa = scanner.nextLine();

		MatHang hangHoa = TimKiemHangHoa.timhanghoatheoten(tenhanghoa, danhsachhang);

		if (hangHoa != null) {
			System.out.println("Hàng hóa trước khi sửa là: " + hangHoa.tenhanghoa);
			int vitri = danhsachhang.indexOf(hangHoa);
			System.out.println("---Nhập tên hàng hóa mới:");
			hangHoa.tenhanghoa = scanner.nextLine();
			danhsachhang.set(vitri, hangHoa);
			System.out.println("---Hàng hóa sau khi sửa là: " + danhsachhang.get(vitri).tenhanghoa);
		} else {
			System.out.println("Cập nhật hàng hóa thất bại");
		}
		scanner.close();
	}

//======================Tìm loại================================================================
//==============================================================================================	
	static void timhanghoatheoloai(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng tìm kiếm theo loại");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Loại hàng hóa cần tìm là:    ");
		String loai = scanner.nextLine();

		ArrayList<MatHang> dsTimkiem = TimKiemHangHoa.timhanghoatheoloai(loai, danhsachhang);
		if (!dsTimkiem.isEmpty()) {
			System.out.println("Đã tìm thấy hàng hóa theo loại nhập " + loai);
			for (MatHang hangHoa : dsTimkiem)
				System.out.println(hangHoa.loai + " - " + hangHoa.manhandang + " - " + hangHoa.tenhanghoa + " - "
						+ hangHoa.gianhapkho + " - " + hangHoa.soluongtonkho);
		} else
			System.out.println("Không tìm thấy hàng hóa cần tìm ");
		scanner.close();
	}

//=====================tìm giá=====================================================================
//=================================================================================================	
	static void timkiemtheogia(ArrayList<MatHang> danhsachhang) {

		System.out.println("Bắt đầu chức năng tìm kiếm theo giá");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Giá hàng hóa cần tìm là:    ");
		double gianhapkho = scanner.nextDouble();
		ArrayList<MatHang> dsKetqua = TimKiemHangHoa.timhanghoatheogia(gianhapkho, danhsachhang);
		if (dsKetqua.isEmpty()) {
			System.out.println("Không tìm thấy hàng hóa cần tìm ");
		} else {
			System.out.println("Đã tìm thấy hàng hóa theo giá vừa nhập " + gianhapkho);
			for (MatHang hangHoa : dsKetqua) {
				System.out.println(hangHoa.loai + " - " + hangHoa.manhandang + " - " + hangHoa.tenhanghoa + " - "
						+ hangHoa.gianhapkho + " - " + hangHoa.soluongtonkho);

			}
		}
		scanner.close();
	}

//=========================tìm ngày==========================================================
//===========================================================================================	
	static void timkiemtheongay(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng tìm kiếm theo ngày");
		Scanner scanner = new Scanner(System.in);
		String ngaynhapkho;
		System.out.println("Nhập ngày hàng hóa là:    ");
		ngaynhapkho = scanner.nextLine();
		ArrayList<MatHang> dsKetqua = TimKiemHangHoa.timhanghoatheongay(ngaynhapkho, danhsachhang);
		if (dsKetqua.isEmpty()) {
			System.out.println("Không tìm thấy hàng hóa cần tìm ");
		} else {
			System.out.println("Đã tìm thấy hàng hóa theo ngày vừa nhập " + ngaynhapkho);
			for (MatHang hangHoa : dsKetqua) {
				System.out.println(hangHoa.loai + " - " + hangHoa.manhandang + " - " + hangHoa.tenhanghoa + " - "
						+ hangHoa.gianhapkho + " - " + hangHoa.soluongtonkho + " - " + hangHoa.ngaynhapkho);
			}
		}
		scanner.close();
	}

//====================tìm mã==================================================================
//============================================================================================	
	static void timkiemtheoma(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng tìm kiếm theo mã");
		Scanner scanner = new Scanner(System.in);
		String manhandang;
		System.out.println("Nhập mã hàng hóa cần tìm: ");
		manhandang = scanner.nextLine();
		MatHang hangHoa = TimKiemHangHoa.timhanghoatheoma(manhandang, danhsachhang);
		if (hangHoa != null) {
			System.out.println(hangHoa.loai + " - " + hangHoa.manhandang + " - " + hangHoa.tenhanghoa + " - "
					+ hangHoa.gianhapkho + " - " + hangHoa.soluongtonkho + " - " + hangHoa.ngaynhapkho);
		} else {
			System.out.println("Không tìm thấy hàng hóa với mã là " + manhandang);
		}
		scanner.close();
	}

//========================tìm khoảng ngày======================
//========================================================	
	static void timkiemtheokhoangngay(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng tìm kiếm theo khoảng ngày");
		Scanner scanner = new Scanner(System.in);
		String ngaydau;
		System.out.println("Nhập ngày bắt đầu theo định dạng (dd/mm/yyyy): ");
		ngaydau = scanner.nextLine();
		String ngaycuoi;
		System.out.println("Nhập ngày kết thúc theo định dạng (dd/mm/yyyy): ");
		ngaycuoi = scanner.nextLine();
		ArrayList<MatHang> dsKetqua = TimKiemHangHoa.timhanghoatheokhoangngay(ngaydau, ngaycuoi, danhsachhang);
		for (MatHang hangHoa : dsKetqua) {
			System.out.println(hangHoa.loai + " - " + hangHoa.manhandang + " - " + hangHoa.tenhanghoa + " - "
					+ hangHoa.gianhapkho + " - " + hangHoa.soluongtonkho + " - " + hangHoa.ngaynhapkho);

		}
		scanner.close();

	}

//========================tìm khoảng giá======================
//=============================================================		
	static void timkiemtheokhoanggia(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng tìm kiếm theo khoảng giá");
		{
			Scanner scanner = new Scanner(System.in);
			double giadau;
			System.out.println("Nhập giá bắt đầu: ");
			giadau = scanner.nextDouble();
			double giacuoi;
			System.out.println("Nhập giá kết thúc: ");
			giacuoi = scanner.nextDouble();
			ArrayList<MatHang> dsKetqua = TimKiemHangHoa.timhanghoatheokhoanggia(giadau, giacuoi, danhsachhang);
			for (MatHang hangHoa : dsKetqua) {
				System.out.println(hangHoa.loai + " - " + hangHoa.manhandang + " - " + hangHoa.tenhanghoa + " - "
						+ hangHoa.gianhapkho + " - " + hangHoa.soluongtonkho + " - " + hangHoa.ngaynhapkho);
			}
		}
	}

//---------------------sắp xếp-----------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------
	static void sapxepgianhaptangdan(ArrayList<MatHang> danhsachhang) {
		System.out.println("Danh sách hàng hóa sau khi xắp xếp giá nhập tăng dần");
		ArrayList<MatHang> dsSapxep = SapxepHangHoa.sapxepgianhaptangdan(danhsachhang);
		for (MatHang hangHoa : dsSapxep) {
			System.out.println("Hang hoa: " + hangHoa.tenhanghoa + " - " + hangHoa.gianhapkho);
		}
	}

//==================sắp xếp giá giảm==================
	static void sapxepgianhapgiamdan(ArrayList<MatHang> danhsachhang) {
		System.out.println("Danh sách hàng hóa sau khi xắp xếp giá nhập giảm dần");
		ArrayList<MatHang> dsSapxep = SapxepHangHoa.sapxepgianhapgiamdan(danhsachhang);
		for (MatHang hangHoa : dsSapxep) {
			System.out.println("Hang hoa: " + hangHoa.tenhanghoa + " - " + hangHoa.gianhapkho);
		}
	}

//======================sắp xếp ngày tăng===================
	static void sapxepngaynhaptangdan(ArrayList<MatHang> danhsachhang) {
		System.out.println("Danh sách hàng hóa sau khi xắp xếp ngày nhập tăng dần");
		ArrayList<MatHang> dsSapxep = SapxepHangHoa.sapxepngaynhaptangdan(danhsachhang);
		for (MatHang hangHoa : dsSapxep) {
			System.out
					.println("Hang hoa: " + hangHoa.tenhanghoa + " - " + hangHoa.gianhapkho + " - " + hangHoa.ngaynhapkho);
		}
	}

//=======================sắp xếp ngày giảm====================
	static void sapxepngaynhapgiamdan(ArrayList<MatHang> danhsachhang) {
		System.out.println("Danh sách hàng hóa sau khi xắp xếp ngày nhập giảm dần");
		ArrayList<MatHang> dsSapxep = SapxepHangHoa.sapxepngaynhapgiamdan(danhsachhang);
		for (MatHang hangHoa : dsSapxep) {
			System.out
					.println("Hang hoa: " + hangHoa.tenhanghoa + " - " + hangHoa.gianhapkho + " - " + hangHoa.ngaynhapkho);
		}
	}

//==========================sắp xếp theo loại ngày=====================
	static void sapxeptheoloaingay(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng sắp xếp theo loại và ngày");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Loại hàng hóa cần sắp xếp là: ");
		String loai = scanner.nextLine();
		ArrayList<MatHang> dstimkiem = TimKiemHangHoa.timhanghoatheoloai(loai, danhsachhang);
		for (MatHang hangHoa : dstimkiem) {
			System.out
					.println("Hang hoa: " + hangHoa.tenhanghoa + " - " + hangHoa.gianhapkho + " - " + hangHoa.ngaynhapkho);
		}
		scanner.close();
	}

//=========================sắp xếp theo giá ngày=======================
	static void sapxeptheogiangay(ArrayList<MatHang> danhsachhang) {
		System.out.println("Bắt đầu chức năng sắp xếp theo giá và ngày");
		Scanner scanner = new Scanner(System.in);
		double giadau;
		System.out.println("Nhập giá bắt đầu: ");
		giadau = scanner.nextDouble();
		double giacuoi;
		System.out.println("Nhập giá kết thúc: ");
		giacuoi = scanner.nextDouble();
		ArrayList<MatHang> dstimkiem = TimKiemHangHoa.timhanghoatheokhoanggia(giadau, giacuoi, danhsachhang);
		for (MatHang hangHoa : dstimkiem) {
			System.out
					.println("Hang hoa: " + hangHoa.tenhanghoa + " - " + hangHoa.gianhapkho + " - " + hangHoa.ngaynhapkho);
		}
		scanner.close();
	}

//============================thống kê================================
	static void thongketongsoluonghanghoa(ArrayList<MatHang> danhsachhang) {
		System.out.println("Tổng số lượng hàng hóa là: " + ThongKeMatHang.thongketongsoluonghanghoa(danhsachhang));

	}

	static void thongketonggiatrihanghoa(ArrayList<MatHang> danhsachhang) {
		System.out.println("Tổng giá trị hàng hóa là: " + ThongKeMatHang.thongketonggiatrihanghoa(danhsachhang));
	}

	static void thongkesoluongtungloai(ArrayList<MatHang> danhsachhang) {
		System.out.println(
				"Số lượng hàng hóa của loại thực phẩm là:" + ThongKeMatHang.thongkesoluongtungloai("Thực phẩm", danhsachhang));
		System.out.println(
				"Số lượng hàng hóa của loại Sành sứ là:" + ThongKeMatHang.thongkesoluongtungloai("Sành sứ", danhsachhang));
		System.out.println(
				"Số lượng hàng hóa của loại điện máy là:" + ThongKeMatHang.thongkesoluongtungloai("Điện máy", danhsachhang));
	}

}