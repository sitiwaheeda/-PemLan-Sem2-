package Tugas2; //siti waheeda najihah_215150701111046

import java.util.Scanner;

public class luasTugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                int s = input.nextInt();
                Persegi prsg = new Persegi(s);
                System.out.println(prsg.getluas());
                break;
            case 2:
                int a = input.nextInt();
                int t = input.nextInt();
                Segitiga sgtg = new Segitiga(a, t);
                System.out.println(sgtg.getluas());
                break;
            case 3:
                int r = input.nextInt();
                Lingkaran lkrn = new Lingkaran(r);
                if (r % 7 == 0)
                    System.out.println(lkrn.getluas());
                else
                    System.out.println(lkrn.getluas2());
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

class Persegi{
    int s;

    Persegi (int sisi) {
        this.s = sisi;
    }

    int getluas() {
        return s * s;
    }
}

class Segitiga{
    int a;
    int t;

    Segitiga (int alas, int tinggi){
        this.a = alas;
        this.t = tinggi;
    }

    int getluas (){
        return a * t / 2;
    }
}

class Lingkaran{
    int r;

    Lingkaran(int jarijari){
        this.r = jarijari;
    }

    double getluas(){
        return 22 / 7 * r * r ;
    }

    double getluas2(){
        return (int) (3.14 * r * r);
    }
}

