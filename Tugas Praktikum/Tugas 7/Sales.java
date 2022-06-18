package praktikum7;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;
    public static int jumlah = 0;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public double gaji() {
        return (getPenjualan() * getKomisi());
    }

    public String toString() {
        jumlah++;
        return "Sales\t\t        : " +getNama() +
                "\nNo. KTP \t\t    : " +getNoKTP()+
                "\nTotal Penjualan\t\t: " +getPenjualan() +
                "\nBesaran Komisi\t\t: " +getKomisi() +
                "\nPendapatan\t\t    : Rp." +(int)gaji();
    }
}
