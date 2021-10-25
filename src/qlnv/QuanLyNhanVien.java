package qlnv;

public class QuanLyNhanVien implements QuanLy<NhanVien> {
    private int size = 0;
    private NhanVien[] danhSach = new NhanVien[2];

    @Override
    public void them(NhanVien nhanVien) {
        danhSach[size] = nhanVien;
        size++;
    }

    @Override
    public void inra() {
        for (NhanVien x : danhSach
        ) {
            System.out.println(x);
        }
    }

    @Override
    public int tim(int id) {
        for (int i = 0; i < size; i++) {
            if (id == danhSach[i].getId()) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public void sua(int id, NhanVien nhanVien) {
        danhSach[tim(id)] = nhanVien;
    }

    @Override
    public void xoa(int id) {
        for (int i = 0; i < size; i++) {
            if (id == danhSach[i].getId()) {
                danhSach[i]=null;
            }

        }

    }

    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        NhanVien nv = new NhanVien("aaa", 1, 2);
        NhanVien nv2 = new NhanVien("bbb", 2, 25);
        NhanVien nv3 = new NhanVien("bbfdfdgdhb", 3, 25555);
        qlnv.them(nv);
        qlnv.them(nv2);
        qlnv.inra();
        System.out.println(qlnv.tim(1));
        qlnv.sua(2, nv3);
        qlnv.xoa(1);
        qlnv.inra();


    }
}
