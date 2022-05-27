package de3;

public class main {
	public static void main(String[] args) {
		DanhSachMonHoc dSMH1 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH2 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH3 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH4 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH5 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH6 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH7 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH8 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH9 = new DanhSachMonHoc();
		DanhSachMonHoc dSMH10 = new DanhSachMonHoc();
		
		MonHoc monHoc1 = new MonHoc("Java", 3);
		MonHoc monHoc2 = new MonHoc("Cơ sở dữ liệu", 3);
		MonHoc monHoc3 = new MonHoc("Hệ điều hành", 2);
		MonHoc monHoc4 = new MonHoc("Xác xuất thống kê", 2);
		MonHoc monHoc5 = new MonHoc("Giải tích 1", 3);
		MonHoc monHoc6 = new MonHoc("Giải tích 2", 3);
		MonHoc monHoc7 = new MonHoc("Lập trình nâng cao", 3);
		MonHoc monHoc8 = new MonHoc("Lập trình hướng đối tượng", 3);
		MonHoc monHoc9 = new MonHoc("Phân tích thiết kế thuật toán", 3);
		MonHoc monHoc10 = new MonHoc("Thiết kế Web", 3);
		
		dSMH1.ThemMonHocVaoDS(monHoc1);
		
		dSMH2.ThemMonHocVaoDS(monHoc1);
		dSMH2.ThemMonHocVaoDS(monHoc4);
		dSMH2.ThemMonHocVaoDS(monHoc10);
		
		dSMH3.ThemMonHocVaoDS(monHoc2);
		dSMH3.ThemMonHocVaoDS(monHoc6);
		dSMH3.ThemMonHocVaoDS(monHoc7);
		
		dSMH4.ThemMonHocVaoDS(monHoc3);
		dSMH4.ThemMonHocVaoDS(monHoc8);
		dSMH4.ThemMonHocVaoDS(monHoc9);
		
		dSMH5.ThemMonHocVaoDS(monHoc4);
		dSMH5.ThemMonHocVaoDS(monHoc6);
		dSMH5.ThemMonHocVaoDS(monHoc7);
		
		dSMH6.ThemMonHocVaoDS(monHoc5);
		dSMH6.ThemMonHocVaoDS(monHoc6);
		dSMH6.ThemMonHocVaoDS(monHoc8);
		
		dSMH7.ThemMonHocVaoDS(monHoc6);
		dSMH7.ThemMonHocVaoDS(monHoc8);
		dSMH7.ThemMonHocVaoDS(monHoc9);
		
		dSMH8.ThemMonHocVaoDS(monHoc3);
		dSMH8.ThemMonHocVaoDS(monHoc4);
		dSMH8.ThemMonHocVaoDS(monHoc5);
		
		dSMH9.ThemMonHocVaoDS(monHoc1);
		dSMH9.ThemMonHocVaoDS(monHoc8);
		dSMH9.ThemMonHocVaoDS(monHoc10);
		
		dSMH10.ThemMonHocVaoDS(monHoc1);
		dSMH10.ThemMonHocVaoDS(monHoc2);
		dSMH10.ThemMonHocVaoDS(monHoc6);

		DanhSachGiangVien dSGV = new DanhSachGiangVien();
		GV giangVien1 = new GVCH("CH", "1", "Âu Dương Phong", 1989, "Tiến Sĩ", 8, dSMH1, 5, 2011);
		GV giangVien2 = new GVTG("TG", "2", "Hồng Thất Công", 1997 , "Thạc Sĩ", 3, dSMH2, "Hồ Chí Minh");
		GV giangVien3 = new GVCH("CH", "3", "Độc Cô Cầu Bại", 1956, "Tiến Sĩ", 30, dSMH3, 10, 1991);
		GV giangVien4 = new GVTG("TG", "4", "Kim Bình Mai", 1980 , "Tiến Sĩ", 20, dSMH4, "Hà Nội");
		GV giangVien5 = new GVCH("CH", "5", "Nhục Bồ Đoàn", 1999, "Thạc Sĩ", 1, dSMH5, 1, 2020);
		GV giangVien6 = new GVTG("TG", "6", "Nhạc Bất Quần", 1995 , "Thạc Sĩ", 4, dSMH6, "Hồ Chí Minh");
		GV giangVien7 = new GVCH("CH", "7", "Lệnh Hồ Xung", 1993, "Tiến Sĩ", 6, dSMH7, 4, 2014);
		GV giangVien8 = new GVTG("TG", "8", "Lưu Giao Tiên Tử", 1996 , "Thạc Sĩ", 3, dSMH8, "Hà Nội");
		GV giangVien9 = new GVCH("CH", "9", "Trương Vô Kỵ", 1996, "Đại Học", 2, dSMH9, 2, 2017);
		GV giangVien10 = new GVTG("TG", "10", "Châu Tinh Trì", 1992 , "Thạc Sĩ", 3, dSMH10, "Hồ Chí Minh");
		
		dSGV.ThemGiangVienVaoDS(giangVien1);
		dSGV.ThemGiangVienVaoDS(giangVien2);
		dSGV.ThemGiangVienVaoDS(giangVien3);
		dSGV.ThemGiangVienVaoDS(giangVien4);
		dSGV.ThemGiangVienVaoDS(giangVien5);
		dSGV.ThemGiangVienVaoDS(giangVien6);
		dSGV.ThemGiangVienVaoDS(giangVien7);
		dSGV.ThemGiangVienVaoDS(giangVien8);
		dSGV.ThemGiangVienVaoDS(giangVien9);
		dSGV.ThemGiangVienVaoDS(giangVien10);

		
		DanhSachBoMon dSBM = new DanhSachBoMon();
		BoMon boMon = new BoMon("Công nghệ thông tin", dSGV);
		dSBM.ThemBoMonVaoDS(boMon);
		
		dSMH1.xuatDSMH();
		
		
		
		//Phương thức kiểm tra giảng viên là cơ hữu và trên 50 tuổi hay không (tính đến năm 2021)
		System.out.println();
		System.out.println("--------Phương thức kiểm tra giảng viên là cơ hữu và trên 50 tuổi (tính đến năm 2021)--------");
		dSGV.kiemTraGiangVien(giangVien3);
		
		//5) Phương thức kiểm tra hai giảng viên có cùng loại và cùng số năm công tác hay không
		System.out.println();
		System.out.println("--------Phương thức kiểm tra 2 giảng viên cùng loại và cùng số năm công tác--------");
		dSGV.kiemTran2GiangVien(giangVien8, giangVien10);
		
		//6) Tính tổng số giảng viên cơ hữu của bộ môn có năm sinh trước 1990
		System.out.println();
		System.out.println("--------Tổng số giảng viên cơ hữu có năm sinh trước 1990--------");
		dSBM.tinhTongSoGiangVienCH(boMon);
		
		//7) Tìm giảng viên cơ hữu lớn tuổi nhất trong bộ môn
		System.out.println();
		System.out.println("--------Giảng viên cơ hữu lớn tuổi nhất trong bộ môn--------");
		dSBM.gVCHLonNhat(boMon);
		
		//8) Tìm xem giảng viên có tên cho trước có công tác ở bộ môn hay không?
		System.out.println();
		System.out.println("--------Giảng viên công tác ở bộ môn--------");
		dSBM.TimGiangVienCoTenChoTruoc("Nhục Bồ Đoàn", boMon);
		
		//9) Lấy ra danh sách các giảng viên thỉnh giảng có năm sinh là một năm cho trước (ví dụ năm 1990, hay 1989)
		System.out.println();
		System.out.println("--------Danh sách các giảng viên thỉnh giảng có năm sinh là một năm cho trước--------");
		dSGV.DanhSachGVTGCoNamSinhLaMotNamChoTruoc(1980);
		
		//10)Sắp xếp các giảng viên trong bộ môn tăng dần theo họ tên và giảm dần theo năm sinh (sử dụng interface Comparable hoặc Comparator)
		System.out.println();
		System.out.println("--------Sắp xếp các giảng viên trong bộ môn tăng dần theo họ tên và giảm dần theo năm sinh--------");
		dSBM.SapXepGiangVienTrongBoMon(boMon);
	}
}
