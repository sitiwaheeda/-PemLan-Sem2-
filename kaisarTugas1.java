//Nama  : Siti Waheeda Najihah
//NIM   : 215150701111
package TUGAS1; //siti waheeda najihah_215150701111046

import java.util.Scanner;

public class kaisarTugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String teksmasukan = input.nextLine();
        int N = input.nextInt();

        getEnskripsi(teksmasukan, N);
    }

    static void getEnskripsi(String teksmasukan, int N) {
        for (int i = 0; i < teksmasukan.length(); i++) {

            if (teksmasukan.charAt(i) >= 65 && teksmasukan.charAt(i) <= 90) {

                if (teksmasukan.charAt(i) + N > 90)
                    System.out.print((char)(teksmasukan.charAt(i) + N - 26));
                else
                    System.out.print((char)(teksmasukan.charAt(i) + N));
            }
            if (teksmasukan.charAt(i) >= 97 && teksmasukan.charAt(i) <= 122){

                if (teksmasukan.charAt(i) + N > 122)
                    System.out.print((char)(teksmasukan.charAt(i) + N - 26));
                else
                    System.out.print((char)(teksmasukan.charAt(i) + N));
            }
            if (teksmasukan.charAt(i) == ' '){
                System.out.print(' ');
            }
        }
    }
}
