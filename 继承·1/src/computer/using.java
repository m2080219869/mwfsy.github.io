package computer;

public class using {
    public static void main(String[] args) {
        pc pc1 = new pc(16,512,"rtx3060","红米g por游戏本");
        nodpad nodpad1 = new nodpad(8,128,"集显无显卡","xiaomi pad 5","暗影灰");
        pc1.setNc(32);
        pc1.setYpnc(1000);
        pc1.prin();
        nodpad1.prin();
       int a=nodpad1.dx;
        System.out.println("----------");
        System.out.println(a);
        System.out.println("----------");

    }
}
