package de3;

import java.util.ArrayList;

public class DanhSachBoMon {
	private ArrayList<BoMon> danhSachBoMon = new ArrayList <BoMon>();
	
	public void ThemBoMonVaoDS(BoMon boMon) {
		this.danhSachBoMon.add(boMon);
	}
	
	//6) Tính tổng số giảng viên cơ hữu của bộ môn có năm sinh trước 1990
	public void tinhTongSoGiangVienCH(BoMon boMon) {
		System.out.print("Tổng số giảng viên cơ hữu ở bộ môn " + boMon.getTenBoMon());
		boMon.getdSGV().tinhTongSoGiangVienCH();
	}

	//7) Tìm giảng viên cơ hữu lớn tuổi nhất trong bộ môn
	public void gVCHLonNhat(BoMon boMon) {
		System.out.print("Giảng viên cơ hữu lớn tuổi nhất ở bộ môn " + boMon.getTenBoMon());
		boMon.getdSGV().GiangVienCoHuuLonTuoiNhat();
	}
	
	//8) Tìm xem giảng viên có tên cho trước có công tác ở bộ môn hay không?
	public void TimGiangVienCoTenChoTruoc(String hoTen, BoMon boMon) {
		boMon.getdSGV().TimGiangVien(hoTen);
		System.out.println(boMon.getTenBoMon());
	}
	
	//10)Sắp xếp các giảng viên trong bộ môn tăng dần theo họ tên và giảm dần theo năm sinh (sử dụng interface Comparable hoặc Comparator)
	public void SapXepGiangVienTrongBoMon(BoMon boMon) {
		System.out.println();
		System.out.println("\t\t\t\t\tBộ môn: " + boMon.getTenBoMon());
		boMon.getdSGV().SapXep();
	}

}
