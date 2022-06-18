package Tugas8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int role = 0, jumlah = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\tSelamat datang di game Defend FILKOM ! \t ");
        System.out.println();
        System.out.print("Silahkan masukkan nama player : ");
        String nama = scan.nextLine();
        boolean mulai = true;

        while (true) {
            mulai = true;
            System.out.println("Silahkan pilih karakter yang Anda inginkan : ");
            System.out.print("\t1. Magician" + "\n\t2. Healer" + "\n\t3. Warrior");
            System.out.println();

            try {
                String chrctr = scan.nextLine();
                role = Integer.valueOf(chrctr);
            }
            catch (Exception e) {
                mulai = false;
            }
            if (mulai && role > 0 && role < 4) {
                break;
            }
            else if (!mulai) {
                System.out.println("Invalid");
            }
            else {
                System.out.println("Invalid");
            }
        }

        Titan titan = new Titan();
        Character karakter = null;
        System.out.println("");
        System.out.print("Selamat datang, " + nama +"!");
        System.out.println("");
        switch (role) {
            case 1:
                karakter = new Magician();
                karakter.info();
                break;
            case 2:
                karakter = new Healer();
                ((Healer) karakter).info();
                break;
            case 3:
                karakter = new Warrior();
                ((Warrior) karakter).info();
                break;
            default:
        }

        while (titan.getHP() > 0 && karakter.getHP() > 0) {
            jumlah++;
            System.out.printf("========== TURN %d ========= %n", jumlah);
            System.out.println("Enemy's HP\t= " + titan.getHP());
            System.out.printf("%s's HP \t= %d %n ", nama, karakter.getHP());

            if (jumlah % 2 == 0 && karakter instanceof Healer) {
                ((Healer) karakter).heal();
            }

            if (titan.attack() == true) {

                karakter.receiveDamage(titan.getAttack());
            }
        }

        if (titan.getHP() <= 0) {
            titan.setHP(0);
        }
        else if (karakter.getHP() <= 0) {
            karakter.setHP(0);
        }

        String keluaran = titan.getHP() <= 0 ? nama : "Titan";
        System.out.println("");
        System.out.println("\t" + keluaran + "\tmenang\n\n");

        System.out.println("==========\tPLAYER\t==========");
        karakter.info();

        System.out.println("\n==========\tMUSUH\t==========");
        titan.info();
    }
}
