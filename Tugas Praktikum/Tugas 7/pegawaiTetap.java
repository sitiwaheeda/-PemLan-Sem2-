package praktikum7;

public class pegawaiTetap extends Pegawai {
    private double upah;
    public static int jumlah = 0;

    public pegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double gaji() {
        return upah;
    }

    public String toString(){
        jumlah++;
        return "Pegawai Tetap\t\t: " +getNama() +
                "\nNo. KTP \t\t    : " +getNoKTP()+
                "\nUpah\t\t        : " +getUpah() +
                "\nPendapatan\t\t    : Rp." +(int)gaji();
        }
    }
