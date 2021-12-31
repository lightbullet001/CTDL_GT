package com.khoadnd2005110005.trial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import com.khoadnd2005110005.trial.MatHang;

public class SapxepHangHoa {
	static ArrayList<MatHang> sapxepgianhaptangdan(ArrayList<MatHang> danhsachhang) {
		Collections.sort(danhsachhang, new Comparator<MatHang>() {

			public int compare(MatHang o1, MatHang o2) {
				return Double.compare(o1.gianhapkho, o2.gianhapkho);
			}

		});
		return danhsachhang;

	}

	static ArrayList<MatHang> sapxepgianhapgiamdan(ArrayList<MatHang> danhsachhang) {
		Collections.sort(danhsachhang Comparator<MatHang>() {

			public int compare(MatHang o1, MatHang o2) {
				return Double.compare(o2.gianhapkho, o1.gianhapkho);
			}

		});

		return danhsachhang;
	}

	static ArrayList<MatHang> sapxepngaynhaptangdan(ArrayList<MatHang> danhsachhang) {
		Collections.sort(danhsachhang, new Comparator<MatHang>() {

			public int compare(MatHang s1, MatHang s2) {
				Date ngaynhapkhoS1 = chuyendoingay(s1.ngaynhapkho);
				Date ngaynhapkhos2 = chuyendoingay(s2.ngaynhapkho);
				if (ngaynhapkhoS1 == null || ngaynhapkhos2 == null) {
					return 0;
				}

				return ngaynhapkhoS1.compareTo(ngaynhapkhos2);
			}

		});

		return danhsachhang;
	}

	static ArrayList<MatHang> sapxepngaynhapgiamdan(ArrayList<MatHang> danhsachhang) {
		Collections.sort(danhsachhang, new Comparator<MatHang>() {

			public int compare(MatHang s1, MatHang s2) {
				Date ngaynhapkhoS1 = chuyendoingay(s1.ngaynhapkho);
				Date ngaynhapkhos2 = chuyendoingay(s2.ngaynhapkho);
				if (ngaynhapkhoS1 == null || ngaynhapkhos2 == null) {
					return 0;
				}

				return ngaynhapkhos2.compareTo(ngaynhapkhoS1);
			}

		});

		return danhsachhang;
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