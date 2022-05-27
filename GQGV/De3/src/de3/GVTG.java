package de3;

public class GVTG extends GV {
    String noiCongTac;
    public GVTG(String loai,String ma, String hoTen, int namSinh, String trinhDo, int soNamCT, DanhSachMonHoc dSMH, String noiCongTac ){
        super(loai, ma, hoTen, namSinh, trinhDo, soNamCT, dSMH);
        this.noiCongTac = noiCongTac;
    }
    
    public String getNoiCongTac() {
		return noiCongTac;
	}


	public void setNoiCongTac(String noiCongTac) {
		this.noiCongTac = noiCongTac;
	}

	@Override
	public String toString() {
		return super.toString() +  ", Nơi CT: " + noiCongTac;
	}

	
	
}
