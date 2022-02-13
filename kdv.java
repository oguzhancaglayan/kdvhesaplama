import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double kdvlifiyat,fiyat = 0,kdvmiktari;

        Scanner inp = new Scanner(System.in);
       System.out.println("ürünün fiyatını giriniz");
        fiyat= inp.nextDouble();
        boolean kosul1 = fiyat > 1000;
        double kdv = (kosul1) ? 0.08 : 0.18 ;
        kdvmiktari = fiyat*kdv;
        kdvlifiyat = fiyat+kdvmiktari;
        System.out.println("kdvli fiyatı:"+ kdvlifiyat);
        System.out.println("kdvsi:"+ kdvmiktari);
        System.out.println("kdvsiz fiyatı"+fiyat);


    }


}
