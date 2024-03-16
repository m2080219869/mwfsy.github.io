package computer;

public class pc extends comp {
    private String brand;
    public void vv(){
        dx++;
    }
    public pc(int nc, int ypnc, String xk, String brand) {
        super(nc, ypnc, xk);
        this.brand = brand;
    }

    @Override
    public void setNc(int nc) {
        super.setNc(nc);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void prin(){
        System.out.println(getBrand()+"\t"+getXk()+"\t");
        System.out.println("内存:"+getNc()+"g");
        System.out.println("硬盘内存："+getYpnc()+"g");
    }
}
