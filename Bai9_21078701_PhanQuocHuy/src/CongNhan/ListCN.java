package CongNhan;

import java.util.Arrays;

public class ListCN {
	public int count;
		CNR[] ls;
		public void listCN(int n) {
			ls = new CNR[n];
			count = 0;
		}
		
		public void tangKT() {
			CNR[] tam = new CNR[ls.length*2];
			System.arraycopy(ls, 0, tam, 0, count);
			ls = tam;
		}

		public boolean themCN(CNR cn) {
			if(count == ls.length) {
				tangKT();
			}
			//Kiểm tra trùng mã CN
			for (int i = 0; i < count; i++) {
				if(ls[i].getMaCN().equalsIgnoreCase(cn.getMaCN())) {
					return false;
				}
			}
			ls[count] = cn;
			count++;
			return true;
		}
		
		public boolean xoa(String maXoa) {
			int viTri =- 1;
			for (int i = 0; i < count; i++) {
				if (ls[i].getMaCN().equalsIgnoreCase(maXoa)) {
				viTri=i;
				}
			}if (viTri !=- 1) {
				for (int i = viTri; i < count-1; i++)
					ls[i]=ls[i+1];
					count --;
					return true;
			}else {
			return false;
			}
		}
		
		public CNR[] getAll() {
			return ls;
		}
		
		  public void xuatToanBoCongNhan() {
		        for (int i = 0; i < count; i++) {
		            System.out.println(ls[i]);
		        }
		    }

		    // Method to count the number of workers
		    public int tinhSoLuongCongNhan() {
		        return count;
		    }

		    // Method to print workers with more than 200 products
		    public void xuatCongNhanTren200SP() {
		        for (int i = 0; i < count; i++) {
		            if (ls[i].getmSoSP() >= 200) {
		                System.out.println(ls[i]);
		            }
		        }
		    }

		    // Method to sort workers by the number of products in descending order
		    public void sapXepCongNhanTheoSoSPGiamDan() {
		        Arrays.sort(ls, 0, count, (cn1, cn2) -> Integer.compare(cn2.getmSoSP(), cn1.getmSoSP()));
		    }
}
