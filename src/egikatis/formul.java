package egikatis;

public class formul {

    public void menzilBul(double p_v, double p_aci) {
        double menzil = (p_v * p_v * Math.sin(p_aci) * Math.sin(p_aci)) / (2 * 10);
        System.out.println("menzil : "+menzil+" m");
    }

    public void hMaxBul(double p_v, double p_aci) {
        double hMax = (p_v * p_v * Math.sin(p_aci * 2)) / 10;
            System.out.println("hMax : "+hMax+" m");
    }

    public void xHizBul(double p_v, double p_aci) {
        double Vx = p_v * Math.cos(p_aci);
            System.out.println("Vx : "+Vx+" m/s");
    }

    public void yHizBul(double p_v, double p_aci, double p_sure) {
        double Vy = (p_v * Math.sin(p_aci)) - (10 * p_sure);
            System.out.println("Vy : "+Vy+" m/s");
    }

}
