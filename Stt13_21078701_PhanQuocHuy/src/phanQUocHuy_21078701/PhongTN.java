package phanQUocHuy_21078701;

public class PhongTN extends PhongHoc {

	@Override
	public boolean getDatChuan() {
		// TODO Auto-generated method stub
		return (duSang()&& isCoBonRua());
	}
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}
	public PhongTN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String bonRua = (isCoBonRua()) ? "Co bon rua" : "Khong co bon rua";
		return super.toString() + String.format("%10s|%10s|%10s|", getChuyenNganh(),getSucChua(),bonRua);
	}
	
	
	
	
}
