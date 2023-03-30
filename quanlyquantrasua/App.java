package quanlyquantrasua;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Controller controller=new Controller();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Để xem danh Sách");
            System.out.println("2.Để xem tìm sản phẩm");
            System.out.println("3. Để bán hàng");
            int chon= sc.nextInt();
            switch (chon){
                case 1:
                    controller.xem();
                    break;
                case 2:
                    controller.sreach();
                    break;
                case 3:
                    controller.BanSanPham();
                    break;
                case 4:
                    controller.BaoCaoBanHangTungSanPham();
            }

        }while(true);
    }
}
