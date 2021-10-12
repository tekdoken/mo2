package bai4;

public class Nhat {
    double width,height;
    public Nhat(){}
    public Nhat(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double dienTich(){
        return this.height*this.width;
    }
    public  double chuVi(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "chu nhat{" + "dai=" + width + ", rong=" + height + "}";
    }
}
