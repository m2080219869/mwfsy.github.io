package computer;

public class comp {
    private int nc;
    private int ypnc;
    private String xk;
   public int dx;

    public void vv(){
       dx--;
    }
    public comp(int nc, int ypnc, String xk) {
        this.nc = nc;
        this.ypnc = ypnc;
        this.xk = xk;
    }

    public int getNc() {
        return nc;
    }
    public int getYpnc() {
        return ypnc;
    }

    public String getXk() {
        return xk;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }

    public void setXk(String xk) {
        this.xk = xk;
    }

    public void setYpnc(int ypnc) {
        this.ypnc = ypnc;
    }
}
