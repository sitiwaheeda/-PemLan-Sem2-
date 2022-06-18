package BikiniBottom;

public class Mahasiswa extends Manusia {
    private String NIM;
    private double IPK;
    public static int jumlah = 0;

    public Mahasiswa(String nama, String NIK, boolean jenisKelamin, double IPK, String NIM, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public double getBeasiswa(){
        double beasiswa = 0.0;
        if (getIPK() >= 3.0 && getIPK() <= 3.5) {
            beasiswa = 50;
        } else if(getIPK() > 3.5 && getIPK() <= 4.0) {
            beasiswa = 75;
        } return beasiswa;
    }

    public String getStatus(){
        String angkatan = "20" + getNIM().substring(0, 2);
        String prodi = " ";
        switch (NIM.substring(6, 7)) {
            case "2" :
                prodi = "Teknik Meniup Gelembung";
                break;
            case "3" :
                prodi = "Teknik Berburu Ubur Ubur";
                break;
            case "4" :
                prodi = "Sistem Perhamburgeran";
                break;
            case "6" :
                prodi = "Pendidikan Chum Bucket";
                break;
            case "7" :
                prodi = "Teknologi Telepon Kerang";
                break;
            default :
                prodi = "Masih Belum Tersedia";
        }
        return prodi +", " +angkatan;
    }

    public String toString() {
        jumlah++;
        return "\nNama\t\t  : " + getNama() +
                "\nNIK\t\t      : " + getNIK() +
                "\nJenis Kelamin : " + (isJenisKelamin()? "Laki - laki":"Perempuan") +
                "\nPendapatan\t  : " + ((int)getPendapatan() + (int)getBeasiswa()) + "$" +
                "\nNIM\t\t      : " + getNIM() +
                "\nIPK \t\t  : " + getIPK() +
                "\nStatus\t\t  : " + getStatus()+"\n";
    }
}
