package de3;

public class BoMon {
	private String tenBoMon;
	private DanhSachGiangVien dSGV;
	
	public BoMon(String tenBoMon, DanhSachGiangVien dSGV) {
		this.tenBoMon = tenBoMon;
		this.dSGV = dSGV;
	}
	

	public String getTenBoMon() {
		return tenBoMon;
	}


	public void setTenBoMon(String tenBoMon) {
		this.tenBoMon = tenBoMon;
	}


	public DanhSachGiangVien getdSGV() {
		return dSGV;
	}


	public void setdSGV(DanhSachGiangVien dSGV) {
		this.dSGV = dSGV;
	}


	public String toString() {
		return "Ten Bo Mon: "+ tenBoMon;
	}
}	
