package phanQUocHuy_21078701;

import java.security.PublicKey;

public class PhongLT extends PhongHoc {

	@Override
	public boolean getDatChuan() {
			return (duSang() && isMayChieu());
	}
	
	private boolean mayChieu;
	public boolean isMayChieu() {
		return mayChieu;
	}
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	
	public PhongLT() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
		
	
	@Override
	public String toString() {
		String mayChieu = (isMayChieu()) ? "Co may chieu" : "Khong co may chieu";
		return super.toString() + String.format("%10s|", mayChieu);
	}
	
}
