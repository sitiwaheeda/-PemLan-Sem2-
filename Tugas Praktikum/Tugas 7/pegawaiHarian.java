package praktikum7;

public class pegawaiHarian extends Pegawai {
    private double upahPerjam;
    private int totalJam;
    public static int jumlah = 0;

    public pegawaiHarian(String nama, String noKTP, double upahPerjam, int totalJam) {
        super(nama, noKTP);
        this.upahPerjam = upahPerjam;
        this.totalJam = totalJam;
    }

    public double getUpahPerjam() {
        return upahPerjam;
    }

    public void setUpahPerjam(double upahPerjam) {
        this.upahPerjam = upahPerjam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double gaji() {
        if (this.totalJam <= 40) {
            return (getUpahPerjam()*getTotalJam());
        } else {
            return ((getUpahPerjam() * 40)+(getTotalJam() - 40) * getUpahPerjam() * 1.5);
        }
    }

    public String toString() {
        jumlah++;
        return "Pegawai Harian\t\t: "+ getNama() +
                "\nNo. KTP \t\t    : "+ getNoKTP()+
                "\nUpah/jam\t\t    : "+ getUpahPerjam() +
                "\nTotal jam kerja\t\t: " + getTotalJam() +
                "\nPendapatan\t\t    : Rp."+ (int)gaji();
    }
}






