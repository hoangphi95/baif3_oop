package quanlyquantrasua;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    QuanLySanPham sanPham=new QuanLySanPham();
    SanPham sp=new SanPham();
    Scanner sc=new Scanner(System.in);
    public void xem(){
        ArrayList<SanPham>list=sanPham.xemDanhSach();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
    public void sreach(){
        System.out.println("Nhập vào tên Sản Phẩm");
        String ten= sc.nextLine();
        sanPham.sreach(ten);
    }
    public void BanSanPham(){
        System.out.println("Nhập vào id Sản Phẩm");
        String tk= sc.nextLine();
        System.out.println("Nhập vào số lượng sản phẩm");
        int sl= sc.nextInt();
        int thanhTien=sanPham.banSanPham(tk,sl);
        System.out.println("Giá bán sản phẩm :"+thanhTien);
    }
    public void BaoCaoBanHangTungSanPham(){
        sanPham.BaoCaoTungSanPham();
    }

}
