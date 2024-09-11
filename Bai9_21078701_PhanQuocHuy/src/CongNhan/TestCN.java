package CongNhan;

public class TestCN {
    public static void main(String[] args) {
        try {
            // Tạo danh sách công nhân với kích thước ban đầu
            ListCN list = new ListCN();
            list.listCN(5); // Khởi tạo danh sách với kích thước 5
            
            // Tạo một số công nhân
            CNR cn1 = new CNR("CN001", "Nguyen", "An", 200);
            CNR cn2 = new CNR("CN002", "Tran", "B", 400);
            CNR cn3 = new CNR("CN003", "Le", "C", 600);
            
            // Thêm công nhân vào danh sách
            list.themCN(cn1);
            list.themCN(cn2);
            list.themCN(cn3);
            
            // Hiển thị danh sách công nhân
            System.out.println("Danh sách công nhân:");
            list.xuatToanBoCongNhan();
            
            // Tính lương cho từng công nhân
            System.out.println("\nLương của từng công nhân:");
            for (CNR cn : list.getAll()) {
                if (cn != null) { // Kiểm tra không phải null
                    System.out.printf("Mã CN: %s, Lương: %.2f\n", cn.getMaCN(), cn.tinhLuong());
                }
            }
            
            // Xóa một công nhân
            list.xoa("CN002");
            System.out.println("\nDanh sách công nhân sau khi xóa:");
            list.xuatToanBoCongNhan();
            
            // Hiển thị công nhân có sản phẩm trên 200
            System.out.println("\nCông nhân có trên 200 sản phẩm:");
            list.xuatCongNhanTren200SP();
            
            // Sắp xếp công nhân theo số sản phẩm giảm dần
            list.sapXepCongNhanTheoSoSPGiamDan();
            System.out.println("\nDanh sách công nhân sau khi sắp xếp theo số sản phẩm:");
            list.xuatToanBoCongNhan();

        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}