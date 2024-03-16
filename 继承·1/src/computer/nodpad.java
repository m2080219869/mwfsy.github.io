package computer;

public class nodpad  extends pc{
    private String color;
    public nodpad(int nc, int ypnc, String xk, String brand, String color) {
        super(nc, ypnc, xk, brand);
        this.color = color;
    }
    int a=super.dx;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void prin(){

        System.out.println(getBrand()+"\t"+getColor()+"\t"+getXk()+"\t");
        System.out.println("内存:"+getNc()+"g");
        System.out.println("硬盘内存:"+getYpnc()+"g");
    }
}
