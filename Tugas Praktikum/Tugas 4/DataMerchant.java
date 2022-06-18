package Tugas4; //siti waheeda najihah_215150701111046

import java.util.Scanner;

public class DataMerchant {
    static Scanner input = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant merchant) {
        Merchant[] merchants = new Merchant[merc.length + 1];

        for (int i=0; i< merc.length; i++) {
            merchants[i] = merc[i];
        }
        merchants [merc.length] = merchant;
        return merchants;
    }

    public static void tampilanData() {
        for (Merchant mch1 : merc) {
            System.out.println("====Tampilan Data Merchant UB Food====");
            System.out.println("Nama Merchant       : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk         : " + mch1.getNamaProduk());
            System.out.println("Harga               : " + (int)mch1.getHargaMakanan());

        }
    }

    public static Merchant cariMerchant(String nama) {

        return null;
    }
    public static void tampilMerchant (Merchant merchant) {

    }
    public static void updateMerchant (Merchant merchant) {

    }

}

