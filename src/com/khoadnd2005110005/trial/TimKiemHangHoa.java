package com.khoadnd2005110005.trial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.khoadnd2005110005.trial.MatHang;

public class TimKiemHangHoa {

	static MatHang timhanghoatheoten(String tenhanghoa, ArrayList<MatHang> danhsachhang) {
		for (MatHang hangHoa : danhsachhang)
			if (hangHoa.tenhanghoa.toLowerCase().equals(tenhanghoa.toLowerCase()))
				return hangHoa;
		return null;
	}

	static ArrayList<MatHang> timhanghoatheoloai(String loai, ArrayList<MatHang> danhsachhang) {
		ArrayList<MatHang> result = new ArrayList<>();
		for (int i = 0; i < danhsachhang.size(); i++) {
			if (danhsachhang.get(i).loai.toLowerCase().equals(loai.toLowerCase())) {
				result.add(danhsachhang.get(i));
			}

		}

		return result;
	}

	static ArrayList<MatHang> timhanghoatheogia(double gianhapkho, ArrayList<MatHang> danhsachhang) {
		ArrayList<MatHang> result = new ArrayList<>();
		for (int i = 0; i < danhsachhang.size(); i++) {
			if (danhsachhang.get(i).gianhapkho == (gianhapkho)) {
				result.add(danhsachhang.get(i));
			}

		}
		return result;
	}

	static ArrayList<MatHang> timhanghoatheongay(String ngaynhapkho, ArrayList<MatHang> danhsachhang) {
		ArrayList<MatHang> result = new ArrayList<>();
		for (int i = 0; i < danhsachhang.size(); i++) {
			if (danhsachhang.get(i).ngaynhapkho.equals(ngaynhapkho)) {
				result.add(danhsachhang.get(i));

			}
		}
		return result;

	}

	static MatHang timhanghoatheoma(String manhandang, ArrayList<MatHang> danhsachhang) {
		MatHang result = null;
		for (MatHang hangHoa : danhsachhang)

			if (hangHoa manhandang.toLowerCase().equals(manhandang.toLowerCase())) {
				result = hangHoa;
				break;
			}
		}
		return result;
	}

	static ArrayList<MatHang> timhanghoatheokhoanggia(Double giabatdau, double giaketthuc,
			ArrayList<MatHang> danhsachhang) {
		ArrayList<MatHang> result = new ArrayList<>();
		for (MatHang hangHoa : danhsachhang) {
			double gianhapkho = hangHoa.gianhapkho;
			double giadau = (giabatdau);
			double giacuoi = (giaketthuc);
			if ((gianhapkho >= (giadau)) && gianhapkho <= (giacuoi)) {
				result.add(hangHoa);
			}
		}
		return result;
	}

	static ArrayList<MatHang> timhanghoatheokhoangngay(String ngaydau, String ngaycuoi, ArrayList<MatHang> danhsachhang) {
		ArrayList<MatHang> result = new ArrayList<>();
		for (MatHang hangHoa : danhsachhang
			Date ngaynhapkho = chuyendoingay(hangHoa.ngaynhapkho);
			Date ngaybatdau = chuyendoingay(ngaydau);
			Date ngayketthuc = chuyendoingay(ngaycuoi);

			if (ngaynhapkho == null) {
				break;
			}

			if (ngaybatdau == null) {
				break;
			}

			if (ngayketthuc == null) {
				break;
			}

			if ((ngaynhapkho.equals(ngaybatdau) || ngaynhapkho.after(ngaybatdau))
					&& (ngaynhapkho.before(ngayketthuc) || ngaynhapkho.equals(ngayketthuc))) {
				result.add(hangHoa);
			}
		}
		return result;

	}

	// 22/11/2021
	private static Date chuyendoingay(String ngaynhap) {
		SimpleDateFormat simpledate = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return simpledate.parse(ngaynhap);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}