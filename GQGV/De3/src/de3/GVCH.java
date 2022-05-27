package de3;

public class GVCH extends GV {
	int heSoLuong, namBatDauCT;
     
    public GVCH(String loai,String ma, String hoTen, int namSinh, String trinhDo, int soNamCT, DanhSachMonHoc dSMH, int heSoLuong, int namBatDauCT){
    	super(loai, ma, hoTen, namSinh, trinhDo, soNamCT, dSMH);
        this.heSoLuong = heSoLuong;
        this.namBatDauCT = namBatDauCT;
    }

	public int getNamBatDauCT() {
		return namBatDauCT;
	}


	public void setNamBatDauCT(int namBatDauCT) {
		this.namBatDauCT = namBatDauCT;
	}

	@Override
	public String toString() {
		return super.toString() + ", Hệ số lương: " + heSoLuong + ", Năm bắt đầu CT: " + namBatDauCT + "]";
	}
	
	
	
}
