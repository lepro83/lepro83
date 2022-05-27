package de3;

public class GV implements Comparable<GV> {
	private String loai, ma, hoTen, trinhDo;
	private int namSinh, soNamCT;
	private DanhSachMonHoc dSMH;
	DanhSachMonHoc mh;
	
	public GV(String loai, String ma, String hoTen, int namSinh, String trinhDo, int soNamCT, DanhSachMonHoc dSMH) {
		super();
		this.loai = loai;
		this.ma = ma;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.trinhDo = trinhDo;
		this.soNamCT = soNamCT;
		this.dSMH = dSMH;
	}

	public DanhSachMonHoc getdSMH() {
		return dSMH;
	}

	public void setdSMH(DanhSachMonHoc dSMH) {
		this.dSMH = dSMH;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public int getSoNamCT() {
		return soNamCT;
	}

	public void setSoNamCT(int soNamCT) {
		this.soNamCT = soNamCT;
	}
	
	@Override
	public String toString() {
		return "Mã: " + ma + ", Họ tên: " + hoTen + ", Trình độ: " + trinhDo
			+ ", Năm sinh: " + namSinh + dSMH + ", Số năm công tác: " + soNamCT;
	}

	@Override
	public int compareTo(GV o) {
		// TODO Auto-generated method stub
		return 0;
	}
}