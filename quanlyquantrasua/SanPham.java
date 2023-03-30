package quanlyquantrasua;

public class SanPham {
    private String idSanPham;
    private String tenSanPham;
    private int giaSanPham;
    private int soluong;
    public SanPham(){

    }

    public SanPham(String idSanPham, String tenSanPham, int giaSanPham,int soluong) {
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soluong=soluong;
    }


    public String getIdSanPham() {

        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {

        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {

        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(int giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "idSanPham='" + idSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaSanPham=" + giaSanPham +
                ", soluong=" + soluong +
                '}';
    }
}
