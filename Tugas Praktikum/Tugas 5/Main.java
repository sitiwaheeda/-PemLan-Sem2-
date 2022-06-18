package PrakRental; //Siti Waheeda Najihah 215150701111046

public class Main {
    public static void main(String[] args) {

        Penyewa penyewa1 = new Penyewa("Kim Jongin", 28, "088888888");
        Penyewa penyewa2 = new Penyewa("Oh Sehun", 28, "0894949494");
        Penyewa penyewa3 = new Penyewa("Park Chanyeol", 29, "0861616161");
        Penyewa penyewa4 = new Penyewa("Byun Baekhyun", 29, "0844444444");

        mobilData data = new mobilData();
        data.tambahMobil("Mercedez Benz E-Class", "J 0N9 IN" ,"Mercedez");
        data.tambahMobil("Ferrari F8", "OH 53 HUN", "Ferrari S.p.A.");
        data.tambahMobil("Mercedez Benz AMG G65", "C 4NY EOL", "Mercedez");
        data.tambahMobil("Audi RS7 Sportback", "B 43K HYUN", "Audi");
        data.daftarMobil();

        arsipRental arsip = new arsipRental();
        arsip.sewa(penyewa1, data.getListMobil().get(0), 3);
        arsip.sewa(penyewa2, data.getListMobil().get(2), 4);
        arsip.sewa(penyewa3, data.getListMobil().get(1), 3);
        arsip.sewa(penyewa4, data.getListMobil().get(3), 1);

        System.out.println();
        Mobil.status();
        System.out.println();
        arsip.tampilanData();
    }
}
