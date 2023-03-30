package quanlyquantrasua;

import java.util.ArrayList;

public class QuanLySanPham implements CongCuSanPham {
    public static ArrayList <SanPham> list;
    @Override
    public ArrayList<SanPham> xemDanhSach() {
        if (list==null){
            list=new ArrayList<>();
            SanPham sp=new SanPham("1","trà sữa",50000,25);
            SanPham sp2=new SanPham("2","coffe",60000,15);
            SanPham sp3=new SanPham("3","bạc xỉu",20000,33);
            SanPham sp4=new SanPham("4","trà Đá",10000,23);
            SanPham sp5=new SanPham("5","trà Chanh",15000,2);
            list.add(sp);
            list.add(sp2);
            list.add(sp3);
            list.add(sp4);
            list.add(sp5);
        }

        return list;
    }

    @Override
    public void sreach(String tim) {
        xemDanhSach();
        for (int i=0;i< list.size();i++){
            if (list.get(i).getTenSanPham().equals(tim)){
                System.out.println(list.get(i));
            }
        }

    }

    @Override
    public void add(SanPham sanPham) {
        list.add(sanPham);
    }

    @Override
    public int banSanPham(String tk,int soluong) {
        xemDanhSach();
    int thanhtien=0;
        for (int i=0;i<list.size();i++){
            if (list.get(i).getIdSanPham().equals(tk)){
                System.out.println(list.get(i));
                thanhtien=list.get(i).getGiaSanPham()*soluong;
            }
        }
        return thanhtien;
    }

    @Override
    public void BaoCaoTungSanPham() {
      xemDanhSach();
      int doanhThu=0;
      int tongSl=0;
      int tongDoanhThu=0;
        for (SanPham sp:list){
              doanhThu=sp.getGiaSanPham()*sp.getSoluong();
              tongSl=sp.getSoluong()+tongSl;
              tongDoanhThu=doanhThu+tongDoanhThu;
            System.out.println(sp.toString()+", Doanh Thu:"+doanhThu);


        }
        System.out.println("Tổng số lượng: "+tongSl+", Tổng Doanh Thu: "+ tongDoanhThu);

    }


}
