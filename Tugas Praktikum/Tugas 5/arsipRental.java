package PrakRental; //Siti Waheeda Najihah 215150701111046

import java.util.ArrayList;

public class arsipRental {
    private static ArrayList<mobilRental> dataRental = new ArrayList<mobilRental>();

    public void sewa(Penyewa penyewa, Mobil mobil, int durasiRental) {
            mobilRental sewa = new mobilRental(penyewa, mobil, durasiRental);
            dataRental.add(sewa);
        }

    public void tampilanData() {

            System.out.println();
            System.out.println("============================================");
            System.out.println(" INFORMASI PELANGGAN ");
            System.out.println("============================================");

        for (mobilRental data : arsipRental.dataRental) {
            System.out.println("NAMA PEMINJAM: " + data.getPenyewa().getName());
            System.out.println("TIPE MOBIL   : " + data.getMobil().getCarType());
            System.out.println("NO. POLISI   : " + data.getMobil().getPolNum());
            System.out.println("LAMA RENTAL  : " + data.getDurasiRental());
            System.out.println("____________________________________________");
        }
    }
}
