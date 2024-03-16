package 继承了解;

public class xs {
    private float cj;
    protected int xh;
    public String name;


    public xs(float cj, int xh, String name) {
        this.cj = cj;
        this.xh = xh;
        this.name = name;
    }

    public float getCj() {
        return cj;
    }


    public String show(){
        return name+"\t"+xh+"\n"+cj;
    }
    private void er(){
        System.out.println("iiii");
    }
    public void her(){
        er();
    }
}
