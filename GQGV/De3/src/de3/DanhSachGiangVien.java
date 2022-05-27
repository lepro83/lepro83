package de3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachGiangVien {
	private ArrayList<GV> danhSachGiangVien = new ArrayList<GV>();
	
	public void ThemGiangVienVaoDS(GV giangVien) {
		this.danhSachGiangVien.add(giangVien);
	}
	
	public void xuatDSGV() {
		for (int i = 0; i < danhSachGiangVien.size(); i++) {
			System.out.println(danhSachGiangVien.get(i));
		}
	}
	
	//4) Phương thức kiểm tra giảng viên là cơ hữu và trên 50 tuổi hay không (tính đến năm 2021)
	public void kiemTraGiangVien(GV gV1) {
			if (gV1.getLoai() == "CH" && 2021 - gV1.getNamSinh() > 50 ) {
				System.out.println(gV1.getHoTen() + " là giảng viên cơ hữu và trên 50 tuổi");
			}
			else {
				System.out.println(gV1.getHoTen() + " không là giảng viên cơ hữu hoặc trên 50 tuổi");
			}
		}
	
	//5) Phương thức kiểm tra hai giảng viên có cùng loại và cùng số năm công tác hay không
	public void kiemTran2GiangVien(GV gV1, GV gV2) {
		if (gV1.getLoai() == gV2.getLoai() && gV1.getSoNamCT() == gV2.getSoNamCT()) {
			System.out.println(gV1.getHoTen() + " và " + gV2.getHoTen() +" là 2 giảng viên cùng loại và cùng số năm công tác");
		} else {
			System.out.println(gV1.getHoTen() + " và " + gV2.getHoTen() + " 2 giảng viên không cùng loại hoặc không cùng số năm công tác");
		}
	}
	
	//Phương thức tính tổng số giảng viên cơ hữu của bộ môn có năm sinh trước 1990
	public void tinhTongSoGiangVienCH() {
		int sum = 0; 
		for (int i = 0; i < danhSachGiangVien.size(); i++) {
			if (danhSachGiangVien.get(i).getLoai() == "CH" && danhSachGiangVien.get(i).getNamSinh() < 1990) {
				sum++;
			}
		}
		System.out.println(" có năm sinh trước 1990 là: " + sum);
	}
	
	//Phương thức tìm giảng viên cơ hữu lớn tuổi nhất trong bộ môn
	public void GiangVienCoHuuLonTuoiNhat() {
		int gVCHLTN = this.danhSachGiangVien.get(0).getNamSinh();
		for (int i = 0; i < this.danhSachGiangVien.size(); i++) {
			if (gVCHLTN > this.danhSachGiangVien.get(i).getNamSinh()) {
				gVCHLTN = this.danhSachGiangVien.get(i).getNamSinh();
			}
		}
		for (int i = 0; i < this.danhSachGiangVien.size(); i++) {
			if (gVCHLTN == this.danhSachGiangVien.get(i).getNamSinh()) {
				System.out.println(" là " + this.danhSachGiangVien.get(i).getHoTen() + " với tuổi lớn nhất là: " + (2021 - gVCHLTN));
			}
		}
	}
	
	//Phương thức tìm xem giảng viên có tên cho trước có công tác ở bộ môn hay không?
	public void TimGiangVien(String hoTen) {
		for (int i = 0; i < this.danhSachGiangVien.size(); i++) {
			if (danhSachGiangVien.get(i).getHoTen() == hoTen) {
				System.out.print(hoTen + " có công tác ở bộ môn ");
			}
		}
	}
	
	//9) Lấy ra danh sách các giảng viên thỉnh giảng có năm sinh là một năm cho trước (ví dụ năm 1990, hay 1989)
	public void DanhSachGVTGCoNamSinhLaMotNamChoTruoc(int namSinh) {
		for (int i = 0; i < danhSachGiangVien.size(); i++) {
			if (danhSachGiangVien.get(i).getLoai() == "TG" && danhSachGiangVien.get(i).getNamSinh() == namSinh) {
				System.out.println(danhSachGiangVien.get(i));
			}
		}
	}
	
	//Phương thức sắp xếp
	public void SapXep() {
		System.out.println();
		System.out.println("Sắp xếp giảm dần theo năm sinh");
		Collections.sort(danhSachGiangVien, new Comparator<GV>(){
			@Override
			public int compare(GV o1, GV o2) {
				return o2.getNamSinh() > o1.getNamSinh() ? 1 : -1;
			}
		});
		for (GV gV : danhSachGiangVien) {
			System.out.println(gV);
		}
		
		System.out.println();
		System.out.println("Sắp xếp tăng dần theo tên");
		Collections.sort(danhSachGiangVien, new Comparator<GV>() {
			@Override
			public int compare(GV o1, GV o2) {
				return (o1.getHoTen().compareTo(o2.getHoTen()));
			}
		});
		for (GV gV: danhSachGiangVien) {
			System.out.println(gV);
		}
	}
	
	//hiển thị số lượng giảng viên theo năm sinh
	public void SoLuongGiangVienTheoNamSinh() {
		int sum = 0;
		for(int i = 1950; i < 2000; i++ ) {
			for (int j = 0; i < danhSachGiangVien.size(); i++) {
				if (danhSachGiangVien.get(j).getNamSinh() == i) {
					sum++;
				}
			}
		}
	}
}
