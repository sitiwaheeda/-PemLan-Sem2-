package praktikum7;

public class Main {
    public static void main(String[] args) {

        System.out.println("=================DAFTAR PEGAWAI TETAP=================");
        System.out.println("\t\t Pegawai Tetap\n");
        Pegawai peg1 = new pegawaiTetap("Bayu", "350728490327424892342", 2000000);
        System.out.println(peg1.toString()+"\n");
        Pegawai peg2 = new pegawaiTetap("Marvendo Aiden", "3503481384903489242934", 1600000);
        System.out.println(peg2.toString()+"\n");
        Pegawai peg3 = new pegawaiTetap("Tsania Arafah", "3503784381748287244572", 2800000);
        System.out.println(peg3.toString()+"\n");

        System.out.println("=================DAFTAR PEGAWAI HARIAN=================");
        System.out.println("\t\t Pegawai Harian\n");
        Pegawai awa1 = new pegawaiHarian("Edo", "3513423849284924949382", 8000, 38);
        System.out.println(awa1.toString()+"\n");
        Pegawai awa2 = new pegawaiHarian("Davendra Dio", "35132948293482342834", 6700, 40);
        System.out.println(awa2.toString()+"\n");
        Pegawai awa3 = new pegawaiHarian("Calderioz Gerald", "351249829342949284559482", 7000, 28);
        System.out.println(awa3.toString()+"\n");

        System.out.println("======================DAFTAR SALES======================");
        System.out.println("\t\t Sales\n");
        Pegawai sal1= new Sales("Tika", "35232948224893431938938", 48, 12000);
        System.out.println(sal1.toString()+"\n");
        Pegawai sal2 = new Sales("Reiki Savian Altezza", "3506622132102319", 82, 18500);
        System.out.println(sal2.toString()+"\n");
        Pegawai sal3 = new Sales("Muhammad Kevlar", "3504605020206378", 67, 9500);
        System.out.println(sal3.toString()+"\n");

        System.out.println("==================== Jumlah Entitas ====================");
        System.out.println("Total Pegawai Tetap   : " + pegawaiTetap.jumlah);
        System.out.println("Total Pegawai Harian  : " + pegawaiHarian.jumlah);
        System.out.println("Total Sales           : " + Sales.jumlah);
    }
}
