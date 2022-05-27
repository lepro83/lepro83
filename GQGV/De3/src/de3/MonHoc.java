package de3;

public class MonHoc{
	private String tenMonHoc;
	private int soTinChi;
	
	public MonHoc(String tenMonHoc, int soTinChi) {
		super();
		this.tenMonHoc = tenMonHoc;
		this.soTinChi = soTinChi;
	}
		
	@Override
	public String toString() {
		return "Tên môn học: " + tenMonHoc + ", Số tín chỉ: " + soTinChi + "]";
	}
	
	
}
