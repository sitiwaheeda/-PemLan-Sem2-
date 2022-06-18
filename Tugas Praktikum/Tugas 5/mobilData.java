package PrakRental; //Siti Waheeda Najihah 215150701111046

import java.util.ArrayList;

public class mobilData {
    static ArrayList<Mobil> listMobil = new ArrayList<Mobil>();
    public ArrayList<Mobil> getListMobil() {
        return listMobil;
    }

    public static void setListMobil(ArrayList<Mobil> listMobil) {
        mobilData.listMobil = listMobil;
    }

    public void tambahMobil(String carType, String polNum, String merk) {
        Mobil car = new Mobil(carType, polNum, merk, true);
        listMobil.add(car);
    }

    void daftarMobil() {

            System.out.println("============================================");
            System.out.println(" DATA MOBIL ");
            System.out.println("============================================");

        for (Mobil data : listMobil) {
            System.out.println("TIPE MOBIL : " + data.getCarType());
            System.out.println("NO. POLISI : " + data.getPolNum());
            System.out.println("MERK MOBIL : " + data.getMerk());
            System.out.println("____________________________________________");
        }
    }
}
