package vn.fpoly.th04829_20042026.entity;

public class SanPham {
    String ma;
    String ten;
    int namBaoHanh;
    float gia;
    int soLuong;
    String danhMuc;

    public SanPham(String ma, String ten, int namBaoHanh, float gia, int soLuong, String danhMuc) {
       setMa(ma);
       setTen(ten);
       setNamBaoHanh(namBaoHanh);
       setGia(gia);
       setSoLuong(soLuong);
       setDanhMuc(danhMuc);
    }

    public String getMa() {

        return ma;
    }

    public void setMa(String ma) {
        if (ma.trim().isEmpty()||ma == null){
            throw new IllegalArgumentException("Ma khong hop le");
        }
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten.trim().isEmpty()||ten == null){
            throw new IllegalArgumentException("Ten khong hop le");
        }
        this.ten = ten;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        if (namBaoHanh<=0){
            throw new IllegalArgumentException("Nam bao hanh khong hop le");
        }
        this.namBaoHanh = namBaoHanh;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        if (gia<=0){
            throw new IllegalArgumentException("gia khong hop le");
        }
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong<=0){
            throw new IllegalArgumentException("So luong khong hop le");
        }
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        if (danhMuc.trim().isEmpty()||danhMuc == null){
            throw new IllegalArgumentException("Ten khong hop le");
        }
        this.danhMuc = danhMuc;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", namBaoHanh=" + namBaoHanh +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", danhMuc='" + danhMuc + '\'' +
                '}';
    }
}
