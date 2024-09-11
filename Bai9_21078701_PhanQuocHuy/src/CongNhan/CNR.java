package CongNhan;

public class CNR {
	public int mSoSP;
	public String maCN, mHo, mTen;
	
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) throws Exception {
		if (maCN != null) {
			throw new Exception("Không có mã công nhân");
		}else {
			this.maCN = maCN;
		}
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) throws Exception {
		if(mHo != null) {
			this.mHo = mHo;
		}else {
			throw new Exception("Không có họ");
		}
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) throws Exception {
		if(mTen != null) {
			this.mTen = mTen;
		}else {
			throw new Exception("Không có tên");
		}
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) throws Exception {
		
		if(mSoSP > 0) {
			this.mSoSP = mSoSP;
		}else {
			throw new Exception("Không có số sản phẩm");
		}
	}
	public CNR(String maCN, String mHo, String mTen, int mSoSP) throws Exception {
		if (maCN != null && mSoSP > 0 && mHo != null && mTen != null) {
			this.maCN = maCN;
			this.mHo = mHo;
			this.mTen = mTen;
			this.mSoSP = mSoSP;	
		}else {
			throw new Exception("Lỗi");
		}
	}
	
		public double tinhLuong() {
	        double donGia;
	        if (mSoSP <= 199) {
	            donGia = 0.5;
	        } else if (mSoSP <= 399) {
	            donGia = 0.55;
	        } else if (mSoSP <= 599) {
	            donGia = 0.6;
	        } else {
	            donGia = 0.65;
	        }
	        return mSoSP * donGia;
	    }
	
	@Override
	public String toString() {
		String s = "";
		s = s + String.format("%10s%10s%10s%10s", getMaCN(),getmHo(),getmTen(),getmSoSP());
		return s;
	}
	
}
