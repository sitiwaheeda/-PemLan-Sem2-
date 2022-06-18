package BikiniBottom;

public class Manager extends Pekerja {
    private int lamaKerja;
    public static int jumlah = 0;

    public Manager(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double BonusManager(){
        return getBonus() * 0.30;
    }

    public String toString() {
        jumlah++;
        return "\nNama\t\t : "+ getNama() +
                "\nNIK\t\t     : " + getNIK() +
                "\nJenisKelamin : " + (jenisKelamin? "LakiLaki" : "Perempuan") +
                "\nPendapatan\t : " + ((int)getTunjangan() + (int)getGaji() + 15 + (int)getBonus()) + "$" +
                "\nBonus\t\t : " + (int)getBonus() + "$" +
                "\nGaji\t\t : " + (int)getGaji() + "$" +
                "\nStatus\t\t : " + getStatus() +
                "\nLama Kerja\t : " + getLamaKerja() + " hari";
    }
}
