package qlnv;

public abstract class Nguoi {
    private String ten;
    private int id;

    public Nguoi(String ten, int id) {
        this.ten = ten;
        this.id = id;
    }

    public Nguoi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
