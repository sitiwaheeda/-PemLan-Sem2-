//TUGAS 2
//Nama  : Siti Waheeda Najihah
//NIM   : 215150701111046
package TUGAS1; //siti waheeda najihah_215150701111046

import java.util.Scanner;

class seldeTugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        getSelde (angka);

        }
        static void getSelde (int angka) {

        System.out.print("");

        int seldeangka = 0, seldenum;
        int num = angka;

        while (angka > 0) {
            seldenum = angka % 10;
            seldeangka = seldeangka * 10 + seldenum;
            angka = angka / 10;
        }

        if (num == seldeangka) {
            System.out.println(num + " adalah selde.");
        } else {
            System.out.println(num + " bukan selde.");
        }
    }
}
