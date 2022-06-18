package Tugas3; //siti waheeda najihah_215150701111046

public class erigo {
    String jenis;
    int harga, jumlah;
    public erigo (String a, int b) {
        this.jenis = a;
        this.jumlah = b;
    }
    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void hargaA() {
        if(jumlah > 100){
            harga = 95000;
        } else {
            this.harga = bajuA;
        }
    }
    void hargaB() {
        if(jumlah > 100){
            harga = 120000;
        } else {
            this.harga = bajuB;
        }
    }
    void hargaC() {
        if(jumlah > 100) {
            harga = 160000;
        } else {
            this.harga = bajuC;
        }
    }

    public String setJenis (String jenis) {
        this.jenis = jenis;
        return jenis;
    }
    public int setJumlah (int jumlah) {
        this.jumlah = jumlah;
        return jumlah;
    }

    public void display() {
        if (jenis.equalsIgnoreCase("a")) {
            hargaA();
        } else if (jenis.equalsIgnoreCase("b")) {
            hargaB();
        } else if(jenis.equalsIgnoreCase("c")) {
            hargaC();
        }

        System.out.println("Jenis Yang Akan Anda beli   : " + jenis);
        System.out.println("Harga per buah              : " + harga);
        System.out.println("Total harga                 : " + (harga * jumlah));
    }
}