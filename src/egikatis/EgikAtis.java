package egikatis;

import java.util.Scanner;

public class EgikAtis {

    public static void main(String[] args) {
        
        formul f = new formul();
        Scanner input = new Scanner(System.in);
        
        double v;
        double Vx;
        
        double sure;
        double menzil;
        double yMax;
        double aci;
        
        System.out.println("ilk hızı giriniz");
        v = input.nextDouble();
        System.out.println("yerle yaptığı açıyı giriniz");
        aci = input.nextDouble();
        System.out.println("yere düşene kadar geçen süreyi giriniz");
        sure = input.nextDouble();
        
        f.xHizBul(v, aci);
        
        f.menzilBul(v, aci);
        f.hMaxBul(v, aci);
        
    }

}
