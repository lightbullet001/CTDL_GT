package com.khoadnd2005110005.trial;

import java.util.ArrayList;

import com.khoadnd2005110005.trial.MatHang;

public class ThongKeMatHang {
	static int thongketongsoluonghanghoa(ArrayList<MatHang> danhsachhang) {
		int tongsoluong = 0;
		for (MatHang hangHoa : danhsachhang)
			tongsoluong = tongsoluong + hangHoa.soluongtonkho;
		}
		return tongsoluong;
	}

	static double thongketonggiatrihanghoa(ArrayList<MatHang> danhsachhang) {
		double tonggiatri = 0;
		for (MatHang hangHoa : danhsachhang) {
			tonggiatri = tonggiatri + (hangHoa.gianhapkho * hangHoa.soluongtonkho);
		}
		return tonggiatri;

	}

	static int thongkesoluongtungloai(String loai, ArrayList<MatHang> danhsachhang) {
		int tongsoluong = 0;
		for (MatHang hangHoa : danhsachhang) {
			if(hangHoa.loai.toLowerCase().equals(loai.toLowerCase())){
				tongsoluong = tongsoluong + hangHoa.soluongtonkho;
			} 
				
			
		}
		return tongsoluong;
	}
}