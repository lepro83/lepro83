package de3;

import java.util.ArrayList;

public class DanhSachMonHoc {
	private ArrayList<MonHoc> danhSachMonHoc = new ArrayList<MonHoc>();
	
	public void ThemMonHocVaoDS(MonHoc monHoc) {
		this.danhSachMonHoc.add(monHoc);
	}
	
	public void xuatDSMH() {
		for (int i = 0; i < danhSachMonHoc.size(); i++) {
			System.out.println(danhSachMonHoc.get(i));
		}
	}
}
