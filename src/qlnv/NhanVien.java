package qlnv;

public class NhanVien extends Nguoi{
 private int luong;

    public NhanVien(String ten, int id, int luong) {
        super(ten, id);
        this.luong = luong;
    }

    public NhanVien() {
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{ ten= " +getTen()+" id= "+getId()+
                " luong= " + luong +
                '}';
    }
}
