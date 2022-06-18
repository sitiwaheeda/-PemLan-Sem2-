package BikiniBottom;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n====================== DAFTAR MANUSIA ======================");
        Manusia man1 = new Manusia ("Aku", "3923842934",true,true);
        System.out.println(man1.toString());
        Manusia man2 = new Manusia ("Kai", "2484099159",true,true);
        System.out.println(man2.toString());
        Manusia man3 = new Manusia ("Ahmad", "8941903414",true,true);
        System.out.println(man3.toString());


        System.out.println("\n====================== DAFTAR MAHASISWA ======================");
        Mahasiswa mhs1 = new Mahasiswa ("I Putu Yoga","351923848239",false,3.70,"2150604511018",false);
        System.out.println(mhs1.toString());
        Mahasiswa mhs2 = new Mahasiswa ("Aldo","32334349183",true,3.55, "222323349004", false);
        System.out.println(mhs2.toString());
        Mahasiswa mhs3 = new Mahasiswa ("Sempurna","3394883849",false,3.90,"20123978192",true);
        System.out.println(mhs3.toString());


        System.out.println("\n====================== DAFTAR PEKERJA ======================");
        Pekerja pkj1 = new Pekerja (9,28,"49549013034","Malik","3429431349",true,true);
        System.out.println(pkj1.toString());
        Pekerja pkj2 = new Pekerja (8,29,"214222331493","Zaki","40341302130",true,false);
        System.out.println(pkj2.toString());
        Pekerja pkj3 = new Pekerja (10,30,"1261320404012","Andin","`23910314104`",false,true);
        System.out.println(pkj3.toString());



        System.out.println("\n====================== DAFTAR MANAGER ======================");
        Manager mng1 = new Manager (888,8,28,"3249819349","Cahyono","28814014934",true,true);
        System.out.println(mng1.toString());
        Manager mng2 = new Manager (970,10,20,"3492849529","Sutera","34831949819",false,true);
        System.out.println(mng2.toString());
        Manager mng3 = new Manager (1111,7,30,"59639532039","Maira","23319239129",false,false);
        System.out.println(mng3.toString());


        System.out.println("==================== Jumlah Entitas ====================");
        System.out.println("Total Manusia   : " + Manusia.jumlah);
        System.out.println("Total Mahasiswa : " + Mahasiswa.jumlah);
        System.out.println("Total Pekerja   : " + Pekerja.jumlah);
        System.out.println("Total Manager   : " + Manager.jumlah);
    }
}