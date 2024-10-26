package phanQUocHuy_21078701;

import java.util.Objects;

public abstract class PhongHoc {
	public abstract boolean getDatChuan();
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	
	//Dong Goi
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String ma) throws Exception {
		if (ma != "") {
			this.maPhong = ma;
		} else {
			throw new Exception("Loi rong"); 
		}
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	
	public PhongHoc() {}
	
	
	String phongHocChuan = (getDatChuan()) ? "DatChuan" : "Khong Dat Chuan";
	public boolean duSang() {
		return getDienTich()/ getSoBongDen() <= 10;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += s.format("|%10s|%10s|%10s|%10s|%10s|", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(),getDatChuan());
		return s;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		PhongHoc other = (PhongHoc) obj;
		if (maPhong == null) {
			if(other.maPhong != null){
				return false;
			}
		}else if (maPhong.equals(other.maPhong))
			return false;
		return true;
	}
	
	
	
	
	
}
