package PrakRental; //Siti Waheeda Najihah 215150701111046

public class mobilRental {
    private Penyewa penyewa;
    private int durasiRental;
    private Mobil mobil;

    public mobilRental(Penyewa penyewa, Mobil mobil ,int durasiRental) {
        this.penyewa = penyewa;
        this.durasiRental = durasiRental;
        this.mobil = mobil;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }
    public int getDurasiRental() {
        return durasiRental;
    }
    public Mobil getMobil() {
        return mobil;
    }

}
