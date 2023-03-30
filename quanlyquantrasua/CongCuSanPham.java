package quanlyquantrasua;

import java.util.ArrayList;

public interface CongCuSanPham {
    ArrayList<SanPham>xemDanhSach();
    void sreach(String  tim);
    void add(SanPham sanPham);
    int banSanPham(String tk,int soLuong);
    void BaoCaoTungSanPham();

}
