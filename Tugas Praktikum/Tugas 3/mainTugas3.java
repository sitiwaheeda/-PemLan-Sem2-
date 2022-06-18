package Tugas3; //siti waheeda najihah_215150701111046

import java.util.Scanner;

public class mainTugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenis;
        int jumlah;

        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        jenis = input.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah  : ");
        jumlah = input.nextInt();

        erigo databaju = new erigo (jenis, jumlah);

        databaju.setJenis(jenis);

        databaju.setJumlah(jumlah);
        databaju.display();



    }
}
